package com.example.weatherapp.models

import androidx.annotation.DrawableRes
import java.time.LocalDate
import java.util.Date

data class ForecastDay(
    val date: LocalDate,
    val condition: String,
    @DrawableRes val conditionResourceId: Int,
    val highTemp: Int,
    val lowTemp: Int,
    val description: String,
)
