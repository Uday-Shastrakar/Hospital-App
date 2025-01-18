package com.app.hosptial.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne



@Entity
data class Tablet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val password: String,  // Encrypted password stored here

    @ManyToOne
    @JoinColumn(name = "room_id")
    val room: Room  // Room associated with this tablet
)