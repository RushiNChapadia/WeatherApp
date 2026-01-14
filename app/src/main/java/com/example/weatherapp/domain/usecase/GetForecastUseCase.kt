package com.example.weatherapp.domain.usecase

import com.example.weatherapp.domain.repo.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(
    private val repo: WeatherRepository
) {
    suspend operator fun invoke(city: String) = repo.getForecast(city)
}