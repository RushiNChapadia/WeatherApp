package com.example.weatherapp.data.remote.models.forecast

import com.example.weatherapp.data.remote.models.weather.WeatherDto

data class ForecastItemDto(
    val dt: Long,
    val dt_txt: String,
    val main: ForecastMainDto,
    val weather: List<WeatherDto>
)
