package com.app.hosptial.service

import com.app.hosptial.repository.PatientRepository
import com.app.hosptial.repository.StaffRepository
import com.app.hosptial.repository.TabletRepository

class TabletServiceImpl (private val tabletRepository: TabletRepository,
    private val patientRepository: PatientRepository,
    private val staffRepository: StaffRepository):TabletService{


    override fun getTabletData(roomNumber: String): Map<String, Any> {
        val tablet = tabletRepository.findByRoomNumber(roomNumber)
            ?: throw RuntimeException("Tablet not found for room: $roomNumber")

        val patient = patientRepository.findByRoomNumber(roomNumber)
            ?: throw RuntimeException("No patient found for room: $roomNumber")

        // Fetch staff data for this patient, categorized by staff type
        val staffMembers = staffRepository.findByPatientId(patient.id)

        val staffInfo = staffMembers.groupBy { it.staffType.typeName }.map { (type, members) ->
            type to members.map {
                mapOf(
                    "staffName" to it.name,
                    "visitTime" to it.visitTime
                )
            }
        }.toMap()

        return mapOf(
            "patientName" to patient.name,
            "doctorName" to patient.doctorName,
            "nurseName" to patient.nurseName,
            "visitTime" to patient.visitTime,
            "staff" to staffInfo // Grouped staff by type
        )
    }
}