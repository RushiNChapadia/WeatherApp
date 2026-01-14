package com.example.weatherapp.domain.model

data class ForecastItem(
    val timeText: String,     // e.g. "2026-01-14 12:00:00"
    val tempC: Double,
    val iconUrl: String,
    val description: String
)
