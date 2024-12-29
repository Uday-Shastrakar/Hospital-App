package com.hospital.mediroom

import ScheduledQueueAdapter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RoomDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_details)

        // Bind TextViews
        val roomNUmberTextView : TextView = findViewById(R.id.roomNumber)
        val patientNameTextView: TextView = findViewById(R.id.patientName)
        val doctorNameTextView: TextView = findViewById(R.id.doctorName)
        val roomStatusTextView: TextView = findViewById(R.id.roomStatus)

        // Static data for testing (replace this with dynamic data later)
        val roomNumber = "101"
        val patientName = "Uday Shastrakar"
        val doctorName = "Dr. Hanson"
        val roomStatus = "Occupied"

        // Set the data to the respective TextViews
        roomNUmberTextView.text = roomNumber
        patientNameTextView.text = patientName
        doctorNameTextView.text = doctorName
        roomStatusTextView.text = roomStatus

        // Setup RecyclerView for Scheduled Queue in Sidebar
        val scheduledQueueDrawerRecyclerView: RecyclerView = findViewById(R.id.scheduledQueueDrawerRecyclerView)
        val drawerQueueAdapter = ScheduledQueueAdapter(getScheduledQueueData())
        scheduledQueueDrawerRecyclerView.layoutManager = LinearLayoutManager(this)
        scheduledQueueDrawerRecyclerView.adapter = drawerQueueAdapter

        // Setup DrawerLayout and open/close the sidebar
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val drawerToggle = ActionBarDrawerToggle(
            this, drawerLayout, R.string.openDrawer, R.string.closeDrawer
        )
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }

    private fun getScheduledQueueData(): List<String> {
        // Static data for scheduled queue (doctor/nurse visits)
        return listOf(
            "Doctor natasha Visit: 10:00 AM",
            "Nurse Harren Visit: 12:00 PM",
            "Doctor victoria Visit: 2:00 PM",
            "Nurse Dolly Visit: 3:00 PM",
            "Doctor victoria Visit: 4:00 PM"
        )
    }
}
