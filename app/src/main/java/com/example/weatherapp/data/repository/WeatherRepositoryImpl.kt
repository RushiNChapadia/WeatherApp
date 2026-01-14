package com.example.weatherapp.data.repository

import com.example.weatherapp.data.mapper.toDomain
import com.example.weatherapp.data.remote.api.OpenWeatherApi
import com.example.weatherapp.domain.model.CurrentWeather
import com.example.weatherapp.domain.model.ForecastItem
import com.example.weatherapp.domain.repo.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: OpenWeatherApi
) : WeatherRepository {
    override suspend fun getCurrentWeather(city: String): CurrentWeather {
        return api.getCurrentWeather(city = city).toDomain()
    }

    override suspend fun getForecast(city: String): List<ForecastItem> {
        val dto = api.getForecast(city = city)
        return dto.list.map { it.toDomain() }
    }
}