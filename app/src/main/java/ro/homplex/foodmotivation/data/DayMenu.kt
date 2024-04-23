package ro.homplex.foodmotivation.data

import java.io.Serializable

data class DayMenu(
    val name: String,
    val breakfast: Receipe,
    val lunch: Receipe,
    val dinner: Receipe,
    val snack: Receipe
) : Serializable