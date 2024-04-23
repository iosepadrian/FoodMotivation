package ro.homplex.foodmotivation.data

import java.io.Serializable

data class Ingredient(
    val name: String = "",
    val quantity: Float = 0f
): Serializable