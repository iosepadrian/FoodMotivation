package ro.homplex.foodmotivation.data

import java.io.Serializable

data class Receipe(
    val name: String? = "",
    val ingredientList: List<Ingredient> = arrayListOf(),
    val preparationSteps: List<String> = arrayListOf()
): Serializable