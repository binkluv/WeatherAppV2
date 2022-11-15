package ru.mmnigmatullov.weatherappv2.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.mmnigmatullov.weatherappv2.presentation.ui.theme.DeepViolet
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun WeatherForecastDaily(
    state: WeatherState,
    modifier: Modifier = Modifier
){
    state.weatherInfo?.weatherDataPerDay?.get(0)?.let { data ->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),


            ) {

            Card(
                backgroundColor = DeepViolet,
                shape = RoundedCornerShape(10.dp)
            )
            {
                Text(
                    text = "Today",
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 20.dp, top = 10.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))

                LazyRow(contentPadding = PaddingValues(40.dp), content = {
                    items(data) { weatherData ->
                        DailyWeatherDisplay(
                            weatherData = weatherData,
                            modifier = Modifier
                                .height(110.dp)
                        )
                    }
                })
            }

        }
    }
        
    }
