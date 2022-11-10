package ru.mmnigmatullov.weatherappv2.domain.repository

import ru.mmnigmatullov.weatherappv2.domain.util.Resource
import ru.mmnigmatullov.weatherappv2.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}