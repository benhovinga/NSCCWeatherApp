package com.example.weatherapp.models

import androidx.annotation.DrawableRes

data class CurrentConditions(
    val condition: String,
    @DrawableRes val conditionResourceId: Int,
    val temperature: Temperature,
    val feelsLike: Temperature,
    val wind: Wind
)