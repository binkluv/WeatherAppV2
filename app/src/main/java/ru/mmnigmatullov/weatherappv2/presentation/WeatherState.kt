package ru.mmnigmatullov.weatherappv2.presentation

import ru.mmnigmatullov.weatherappv2.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
