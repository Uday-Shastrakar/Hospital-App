package com.app.hosptial.model

import jakarta.persistence.*

@Entity
data class Staff(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,

    @ManyToOne
    @JoinColumn(name = "staff_type_id")  // Adjusted column name
    val staffType: StaffType, // Linking to StaffType instead of a String

    @ManyToOne
    @JoinColumn(name = "patient_id")
    val patient: Patient
)