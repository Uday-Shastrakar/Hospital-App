package com.app.hosptial.model

import jakarta.persistence.*

@Entity
data class Staff(
    @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
         val id: Long = 0,
             val name: String,            // Name of the staff member
            val visitTime: String,       // Time when this staff member is scheduled to visit

       @ManyToOne
           @JoinColumn(name = "staff_type_id")
        val staffType: StaffType,    // Foreign key to StaffType table

         @ManyToOne
           @JoinColumn(name = "patient_id")
          val patient: Patient? = null // Link staff to a patient
 )
