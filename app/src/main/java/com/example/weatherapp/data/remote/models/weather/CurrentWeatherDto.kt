package com.example.weatherapp.data.remote.models.weather

data class CurrentWeatherDto(
    val name: String,
    val weather: List<WeatherDto>,
    val main: MainDto,
    val wind: WindDto
)
