package com.app.hosptial.repository

import com.app.hosptial.model.Patient
import com.app.hosptial.model.Room
import com.app.hosptial.model.Staff
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StaffRepository : JpaRepository<Staff,Long>{
    fun findByPatientAndStaffType(patient: Patient, staffType: String): List<Staff>
}