package com.example.weatherapp.domain.model

data class CurrentWeather(
    val city: String,
    val tempC: Double,
    val feelsLikeC: Double,
    val humidity: Int,
    val windSpeed: Double,
    val title: String,
    val description: String,
    val iconUrl: String
)
