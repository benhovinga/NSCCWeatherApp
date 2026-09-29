package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.ForecastDay
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun WeekForecastView(innerPadding: PaddingValues) {
    val dateFormatter = DateTimeFormatter.ofPattern("EEE, MMM d")
    val weekForecast = listOf(
        ForecastDay(
            date = LocalDate.of(2026, 9, 24),
            condition = "Clear",
            conditionResourceId = R.drawable.clear_day,
            highTemp = 19,
            lowTemp = 7,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 25),
            condition = "Cloudy",
            conditionResourceId = R.drawable.cloudy,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 26),
            condition = "Cloudy",
            conditionResourceId = R.drawable.rainy_3,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 27),
            condition = "Cloudy",
            conditionResourceId = R.drawable.rainy_3,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 28),
            condition = "Cloudy",
            conditionResourceId = R.drawable.rainy_3,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 29),
            condition = "Cloudy",
            conditionResourceId = R.drawable.cloudy,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
        ForecastDay(
            date = LocalDate.of(2026, 9, 30),
            condition = "Cloudy",
            conditionResourceId = R.drawable.clear_day,
            highTemp = 16,
            lowTemp = 8,
            description = "Cloudy with a chance of meatballs"
        ),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = innerPadding)
            .padding(horizontal = 15.dp)
    ) {
        itemsIndexed(weekForecast) { index, forecast ->
            Row {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Day of the week (Sunday-Saturday)
                    Text(
                        text = forecast.date.format(dateFormatter),
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(top = 15.dp)
                    )

                    // Condition icon
                    Image(
                        painter = painterResource(id = forecast.conditionResourceId),
                        contentDescription = forecast.condition,
                        modifier = Modifier.size(80.dp)
                    )

                    // Temperatures
                    Text(
                        text = forecast.highTemp.toString() + "°C High " + forecast.lowTemp.toString() + "°C Low",
                        style = MaterialTheme.typography.bodyLarge
                    )

                    // Description
                    Text(
                        text = forecast.description,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(top = 5.dp, bottom = 15.dp)
                    )
                }
            }
            // Display divider except after last item
            if (weekForecast.size - 1 != index) {
                HorizontalDivider(
                    modifier = Modifier,
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.secondary)
            }
        }
    }
}