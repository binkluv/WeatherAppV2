package ru.mmnigmatullov.weatherappv2.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}