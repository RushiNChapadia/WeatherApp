package com.example.weatherapp.data.remote.models.forecast

data class ForecastDto(
    val city: ForecastCityDto,
    val list: List<ForecastItemDto>
)