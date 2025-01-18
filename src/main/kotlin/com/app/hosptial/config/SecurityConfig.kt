package com.app.hosptial.config


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.filter.OncePerRequestFilter




@Configuration
class SecurityConfig(private val jwtUtil: JwtUtil) {

    @Bean
    fun authenticationManager(authConfig: AuthenticationConfiguration): AuthenticationManager {
        return authConfig.authenticationManager
    }

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }
            .authorizeHttpRequests {
                it
                    .requestMatchers("/").authenticated()
                    .requestMatchers("/api/tablets/login").permitAll()  // Allow login without JWT
                    .anyRequest().permitAll() // Protect all other routes
            }
        http.addFilterBefore(JwtAuthenticationFilter(jwtUtil), OncePerRequestFilter::class.java)  // Add JWT filter

        return http.build()
    }
}
