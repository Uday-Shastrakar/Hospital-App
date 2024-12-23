package com.app.hosptial.repository

import com.app.hosptial.model.StaffType
import org.springframework.data.jpa.repository.JpaRepository

interface StaffTypeRepository : JpaRepository<StaffType, Long> {
}
