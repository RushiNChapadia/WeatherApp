package com.example.weatherapp.domain.repo

import com.example.weatherapp.domain.model.CurrentWeather
import com.example.weatherapp.domain.model.ForecastItem

interface WeatherRepository {
    suspend fun getCurrentWeather(city: String): CurrentWeather
    suspend fun getForecast(city: String): List<ForecastItem>
}