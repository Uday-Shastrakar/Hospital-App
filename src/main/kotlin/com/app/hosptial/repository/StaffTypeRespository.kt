package com.app.hosptial.repository

import com.app.hosptial.model.StaffType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StaffTypeRepository : JpaRepository<StaffType, Long> {
    fun findByTypeName(typeName: String): StaffType?
}
