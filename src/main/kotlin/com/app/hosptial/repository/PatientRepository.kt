package com.app.hosptial.repository

import com.app.hosptial.model.Patient
import com.app.hosptial.model.Room
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PatientRepository: JpaRepository<Patient,Long> {
    fun findByRoom(room: Room): Nothing?

}