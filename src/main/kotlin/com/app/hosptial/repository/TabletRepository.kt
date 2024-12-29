package com.app.hosptial.repository

import com.app.hosptial.model.Tablet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TabletRepository :JpaRepository<Tablet,Long> {
    fun findByRoomRoomNumber(roomNumber: String): Tablet?
}