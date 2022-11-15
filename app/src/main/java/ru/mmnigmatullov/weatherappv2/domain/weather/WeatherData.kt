package ru.mmnigmatullov.weatherappv2.domain.weather

import java.time.LocalDate
import java.time.LocalDateTime

data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType,
    val date: LocalDate,
    val tempMin: Double,
    val tempMax: Double
)
