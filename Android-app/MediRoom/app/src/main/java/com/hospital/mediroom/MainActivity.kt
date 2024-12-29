package com.hospital.mediroom

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roomNumberEditText: EditText = findViewById(R.id.roomNumber)
        val passwordEditText: EditText = findViewById(R.id.password)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val roomNumber = roomNumberEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (roomNumber == "101" && password == "admin") {
                try {
                    // Start RoomDetailsActivity after successful login
                    val intent = Intent(this, RoomDetailsActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, "Error starting RoomDetailsActivity", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


