package com.app.hosptial.model

import jakarta.persistence.*

@Entity
data class Patient(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val age: Int,
    val disease: String,

    @OneToOne
    @JoinColumn(name = "room_id")
    val room: Room
)