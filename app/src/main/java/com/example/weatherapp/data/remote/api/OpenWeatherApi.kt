package com.example.weatherapp.data.remote.api

import com.example.weatherapp.ApiKey
import com.example.weatherapp.data.remote.models.forecast.ForecastDto
import com.example.weatherapp.data.remote.models.weather.CurrentWeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherApi {
    // https://api.openweathermap.org/data/2.5/weather?q=London&appid=KEY&units=metric
    @GET("data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String = ApiKey.OPEN_WEATHER,
        @Query("units") units: String = "metric"
    ): CurrentWeatherDto

    // https://api.openweathermap.org/data/2.5/forecast?q=London&appid=KEY&units=metric
    @GET("data/2.5/forecast")
    suspend fun getForecast(
        @Query("q") city: String,
        @Query("appid") apiKey: String = ApiKey.OPEN_WEATHER,
        @Query("units") units: String = "metric"
    ): ForecastDto
}