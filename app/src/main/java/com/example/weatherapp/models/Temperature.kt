package com.example.weatherapp.models


data class Temperature(
    val value: Int,
    val unit: Unit
) {
    enum class Unit { C, F }

    fun toCelsius(): Temperature {
        return if (unit == Unit.C) {
            this
        } else {
            Temperature(((value - 32) * 5) / 9, Unit.C)
        }
    }

    fun toFahrenheit(): Temperature {
        return if (unit == Unit.F) {
            this
        } else {
            Temperature((value * 9) / 5 + 32, Unit.F)
        }
    }

    override fun toString(): String {
        return "$value°$unit"
    }
}