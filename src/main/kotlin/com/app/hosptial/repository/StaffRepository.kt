package com.app.hosptial.repository

import com.app.hosptial.model.Staff
import org.springframework.data.jpa.repository.JpaRepository

interface StaffRepository : JpaRepository<Staff,Long>{
}