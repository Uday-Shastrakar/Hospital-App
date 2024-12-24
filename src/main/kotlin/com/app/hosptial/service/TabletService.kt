package com.app.hosptial.service

interface TabletService {
    fun getTabletData(roomNumber: String):Map<String,Any>
}