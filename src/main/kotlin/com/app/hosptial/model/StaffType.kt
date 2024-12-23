package com.app.hosptial.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
@Entity
data class StaffType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val typeName: String // Name of the staff type (e.g., "Doctor", "Nurse", etc.)
)
