package com.app.hosptial.model

import jakarta.persistence.*

@Entity
data class Room(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val roomNumber: String,
    val roomType: String,
    @Enumerated(EnumType.STRING)
    val status: RoomStatus// Available, Occupied, Cleaning, Under Maintenance
)


enum class RoomStatus {
    AVAILABLE, OCCUPIED, CLEANING, UNDER_MAINTENANCE
}