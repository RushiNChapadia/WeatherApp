package com.example.weatherapp.domain.usecase

import com.example.weatherapp.data.repository.WeatherRepositoryImpl
import com.example.weatherapp.domain.repo.WeatherRepository
import javax.inject.Inject

class GetCurrentWeatherUseCase @Inject constructor(
    private val repo: WeatherRepository
) {
    suspend operator fun invoke(city: String) = repo.getCurrentWeather(city)
}