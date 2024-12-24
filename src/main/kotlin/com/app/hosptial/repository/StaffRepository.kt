package com.app.hosptial.repository

import com.app.hosptial.model.Staff
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StaffRepository : JpaRepository<Staff,Long>{
    fun findByPatientId(patientId: Long): List<Staff>
}