package com.example.team25.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.team25.databinding.ActivityMainBinding
import com.example.team25.ui.login.LoginEntryActivity
import com.example.team25.ui.main.companion.LiveCompanionActivity
import com.example.team25.ui.main.status.ReservationStatusActivity
import com.example.team25.ui.reservation.ReservationActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToLiveCompanion()
        navigateToReservationStatus()
        navigateToReservation()
        setLogoutClickListener()
    }

    private fun setLogoutClickListener() {
        binding.logoutTextView.setOnClickListener {
            mainViewModel.logout()
            navigateToLogin()
        }
    }


    private fun navigateToLiveCompanion() {
        binding.realTimeCompanionSeeAllBtn.setOnClickListener {
            val intent = Intent(this, LiveCompanionActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToReservationStatus() {
        binding.reservationSeeAllBtn.setOnClickListener {
            val intent = Intent(this, ReservationStatusActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToReservation() {
        binding.goReservationBtn.setOnClickListener {
            val intent = Intent(this, ReservationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginEntryActivity::class.java)
        startActivity(intent)
        finish()
    }

}
