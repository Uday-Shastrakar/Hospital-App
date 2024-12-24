package com.app.hosptial.repository

import com.app.hosptial.model.Patient
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PatientRepository: JpaRepository<Patient,Long> {
    fun findByRoomNumber(roomNumber: String): Patient?
}