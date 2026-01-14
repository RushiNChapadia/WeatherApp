package com.example.weatherapp.data.mapper

import com.example.weatherapp.data.remote.models.forecast.ForecastItemDto
import com.example.weatherapp.data.remote.models.weather.CurrentWeatherDto
import com.example.weatherapp.domain.model.CurrentWeather
import com.example.weatherapp.domain.model.ForecastItem

private fun iconUrl(icon: String): String {
    // https://openweathermap.org/img/wn/{code}@2x.png
    return "https://openweathermap.org/img/wn/${icon}@2x.png"
}

fun CurrentWeatherDto.toDomain(): CurrentWeather {
    val w = weather.firstOrNull()
    return CurrentWeather(
        city = name,
        feelsLikeC = main.feels_like,
        tempC = main.temp,
        humidity = main.humidity,
        windSpeed = wind.speed,
        title = w?.main.orEmpty(),
        description = w?.description.orEmpty(),
        iconUrl = iconUrl(w?.description.orEmpty())
    )
}

fun ForecastItemDto.toDomain(): ForecastItem {
    val w = weather.firstOrNull()
    return ForecastItem(
        timeText = dt_txt,
        tempC = main.temp,
        iconUrl = iconUrl(w?.icon.orEmpty()),
        description = w?.description.orEmpty()
    )
}