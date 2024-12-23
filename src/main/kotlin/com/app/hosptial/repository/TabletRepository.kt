package com.app.hosptial.repository

import com.app.hosptial.model.Tablet
import org.springframework.data.jpa.repository.JpaRepository

interface TabletRepository :JpaRepository<Tablet,Long> {
}