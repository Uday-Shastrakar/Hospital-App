package com.app.hosptial.repository


import com.app.hosptial.model.Room
import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<Room, Long> {
    abstract fun findByRoomNumber(roomNumber: String): Room?

}