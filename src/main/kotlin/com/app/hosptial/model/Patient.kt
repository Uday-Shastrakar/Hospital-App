package com.app.hosptial.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val doctorName: String,
    val nurseName: String,
    val visitTime: String, // Time when doctor/nurse will visit
    val roomNumber: Number
)