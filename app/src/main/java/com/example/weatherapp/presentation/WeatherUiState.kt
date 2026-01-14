package com.example.weatherapp.presentation

import com.example.weatherapp.domain.model.CurrentWeather
import com.example.weatherapp.domain.model.ForecastItem

data class WeatherUiState(
    val cityInput: String= "London",
    val isLoading: Boolean=false,
    val current: CurrentWeather?=null,
    val forecast: List<ForecastItem> = emptyList(),
    val error: String? = null
)
