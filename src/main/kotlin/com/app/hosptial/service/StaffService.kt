package com.app.hosptial.service

import com.app.hosptial.model.Staff
import org.springframework.stereotype.Repository

interface StaffService{
    fun getStaffByPatient(patientId:Long):List<Staff>
}