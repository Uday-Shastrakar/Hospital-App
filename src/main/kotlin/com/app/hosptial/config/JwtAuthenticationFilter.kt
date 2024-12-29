package com.app.hosptial.config


import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter


class JwtAuthenticationFilter(private val jwtUtil: JwtUtil) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val token = request.getHeader("Authorization")?.let {
            if (it.startsWith("Bearer ")) it.substring(7) else null
        }

        if (token != null && jwtUtil.validateToken(token)) {
            val username = jwtUtil.extractUsername(token)
            val authentication = UsernamePasswordAuthenticationToken(username, null, emptyList())
            SecurityContextHolder.getContext().authentication = authentication
        }

        filterChain.doFilter(request, response)
    }
}