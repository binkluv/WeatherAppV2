package ru.mmnigmatullov.weatherappv2.data.repository

import ru.mmnigmatullov.weatherappv2.data.mappers.toWeatherInfo
import ru.mmnigmatullov.weatherappv2.data.remote.WeatherApi
import ru.mmnigmatullov.weatherappv2.domain.repository.WeatherRepository
import ru.mmnigmatullov.weatherappv2.domain.util.Resource
import ru.mmnigmatullov.weatherappv2.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api:WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        }catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}