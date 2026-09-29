package com.example.weatherapp.models

data class Wind(
    val speed: Int,
    val speedUnit: Unit,
    val direction: Direction
) {
    enum class Unit { kph, mph,  mps }

    enum class Direction {
        N,
        NE,
        E,
        SE,
        S,
        SW,
        W,
        NW
    }

    override fun toString(): String {
        return "$direction $speed $speedUnit"
    }
}