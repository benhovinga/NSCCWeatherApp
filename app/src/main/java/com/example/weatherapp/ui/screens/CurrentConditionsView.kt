package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.CurrentConditions
import com.example.weatherapp.models.Temperature
import com.example.weatherapp.models.Wind

@Composable
fun CurrentConditionsView() {
    val currentConditions = CurrentConditions(
        condition = "Rain",
        conditionResourceId = R.drawable.rainy_3,
        temperature = Temperature(16, Temperature.Unit.C),
        feelsLike = Temperature(14, Temperature.Unit.C),
        wind = Wind(10, Wind.Unit.kph, Wind.Direction.NE)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.size(50.dp))

        // Condition icon
        Image(
            painter = painterResource(id = currentConditions.conditionResourceId),
            contentDescription = currentConditions.condition,
            modifier = Modifier.size(150.dp)
        )

        // Condition text
        Text(
            text = currentConditions.condition,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(top = 5.dp)
        )

        // Temperature
        Text(
            text = currentConditions.temperature.toString(),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = 5.dp)
        )

        // Feels like
        Text(
            text = "Feels like " + currentConditions.feelsLike.toString(),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 5.dp)
        )

        // Wind
        Text(
            text = "Wind " + currentConditions.wind.toString(),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}