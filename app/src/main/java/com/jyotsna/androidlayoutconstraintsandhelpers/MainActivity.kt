package com.jyotsna.androidlayoutconstraintsandhelpers

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch views
        val weatherIcon: ImageView = findViewById(R.id.weatherIcon)
        val weatherText: TextView = findViewById(R.id.weatherText)
        val refreshButton: Button = findViewById(R.id.refreshButton)

        // Set initial weather data
        weatherIcon.setImageResource(R.drawable.sunny)
        weatherText.text = "Sunny"

        // Set click listener for refresh button
        refreshButton.setOnClickListener {

            // just changing the weather condition and icon
            weatherIcon.setImageResource(R.drawable.rainy)
            weatherText.text = "Rainy"
        }
    }
}
