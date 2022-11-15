package ru.mmnigmatullov.weatherappv2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ru.mmnigmatullov.weatherappv2.domain.weather.WeatherData
import ru.mmnigmatullov.weatherappv2.presentation.ui.theme.DeepViolet
import java.time.format.DateTimeFormatter

@Composable
fun DailyWeatherDisplay(
    weatherData: WeatherData,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
){
    val formattedDate = remember(weatherData){
        weatherData.date.format(
            DateTimeFormatter.ofPattern("dd.MM.yyyy"),
        )
    }
    Column(
        modifier = modifier
            .background(DeepViolet)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = formattedDate,
            color = Color.LightGray
        )
        Image(painter = painterResource(id = weatherData.weatherType.iconRes),
            contentDescription = null,
            modifier = Modifier.width(40.dp)
        )
        Text(
            text = "${weatherData.tempMax}/${weatherData.tempMin}°C",
            color = textColor,
            fontWeight = FontWeight.Bold
        )
    }
}