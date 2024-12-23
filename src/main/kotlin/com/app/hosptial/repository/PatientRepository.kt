package com.app.hosptial.repository

import com.app.hosptial.model.Patient
import org.springframework.data.jpa.repository.JpaRepository

interface PatientRepository: JpaRepository<Patient,Long> {
}