package ro.homplex.foodmotivation

import ro.homplex.foodmotivation.data.DayMenu
import ro.homplex.foodmotivation.data.Ingredient
import ro.homplex.foodmotivation.data.Receipe

object FoodUtils {
    fun getMenuList(): List<DayMenu> {
        return listOf(
            DayMenu(
                name = "Monday",
                breakfast = Receipe("Omelette", listOf(Ingredient("Eggs", 3f), Ingredient("Cheese", 50f), Ingredient("Spinach", 50f)), listOf(
                    "Crack eggs into a bowl",
                    "Whisk eggs until well beaten",
                    "Heat a non-stick pan over medium heat",
                    "Pour beaten eggs into the pan",
                    "Sprinkle cheese and spinach over one half of the omelette",
                    "Cook until the edges start to set",
                    "Fold the omelette in half",
                    "Cook for another minute or until fully set"
                )),
                lunch = Receipe("Grilled Chicken Salad", listOf(Ingredient("Grilled Chicken", 150f), Ingredient("Mixed Greens", 100f), Ingredient("Tomatoes", 50f)),listOf(
                    "Season chicken breasts with salt and pepper",
                    "Preheat grill to medium-high heat",
                    "Grill chicken breasts for 6-7 minutes per side or until cooked through",
                    "Let chicken rest for 5 minutes, then slice thinly",
                    "In a large bowl, toss mixed greens with tomatoes",
                    "Top salad with sliced grilled chicken",
                    "Serve with your favorite dressing"
                )),
                dinner = Receipe("Salmon with Roasted Vegetables", listOf(Ingredient("Salmon", 200f), Ingredient("Broccoli", 100f), Ingredient("Carrots", 100f)),listOf(
                    "Preheat oven to 400°F (200°C)",
                    "Place salmon fillets on a baking sheet lined with parchment paper",
                    "Season salmon with salt, pepper, and any desired herbs or spices",
                    "In a separate baking dish, toss broccoli and carrots with olive oil, salt, and pepper",
                    "Spread vegetables in an even layer on the baking sheet",
                    "Bake for 15-20 minutes or until salmon is cooked through and vegetables are tender",
                    "Serve salmon with roasted vegetables"
                )),
                snack = Receipe("Apple with Almond Butter", listOf(Ingredient("Apple", 1f), Ingredient("Almond Butter", 50f)),listOf(
                    "Slice apple into wedges",
                    "Serve with almond butter for dipping"
                ))
            ),
            DayMenu(
                name = "Tuesday",
                breakfast = Receipe("Pancakes", listOf(Ingredient("Flour", 100f), Ingredient("Milk", 100f), Ingredient("Eggs", 2f)),listOf(
                    "In a large mixing bowl, whisk together flour, sugar, baking powder, and salt",
                    "In a separate bowl, whisk together milk, eggs, and melted butter",
                    "Pour wet ingredients into dry ingredients and stir until just combined",
                    "Heat a non-stick skillet or griddle over medium heat",
                    "Pour batter onto skillet to form pancakes",
                    "Cook until bubbles form on the surface, then flip and cook until golden brown on both sides",
                    "Serve pancakes with your favorite toppings"
                )),
                lunch = Receipe("Quinoa Salad", listOf(Ingredient("Quinoa", 100f), Ingredient("Cucumber", 50f), Ingredient("Feta Cheese", 50f)),listOf(
                    "Rinse quinoa under cold water",
                    "In a medium saucepan, bring water to a boil",
                    "Add quinoa and reduce heat to low, cover, and simmer for 15 minutes or until water is absorbed",
                    "Fluff quinoa with a fork and let cool",
                    "In a large bowl, combine cooked quinoa with diced cucumber and crumbled feta cheese",
                    "Toss with your favorite vinaigrette dressing",
                    "Serve chilled"
                )),
                dinner = Receipe("Stir-fried Tofu with Vegetables", listOf(Ingredient("Tofu", 200f), Ingredient("Bell Peppers", 100f), Ingredient("Soy Sauce", 50f)),listOf(
                    "Press tofu to remove excess moisture",
                    "Cut tofu into cubes",
                    "Heat oil in a large skillet or wok over medium-high heat",
                    "Add tofu cubes and cook until golden brown on all sides",
                    "Remove tofu from skillet and set aside",
                    "In the same skillet, add more oil if needed and stir-fry bell peppers until tender-crisp",
                    "Add cooked tofu back to the skillet",
                    "Season with soy sauce and any desired spices",
                    "Serve hot with rice or noodles"
                )),
                snack = Receipe("Greek Yogurt with Honey", listOf(Ingredient("Greek Yogurt", 150f), Ingredient("Honey", 30f)),listOf(
                    "Scoop Greek yogurt into a bowl",
                    "Drizzle honey over the yogurt",
                    "Stir gently to combine",
                    "Serve immediately"
                ))
            ),
            DayMenu(
                name = "Wednesday",
                breakfast = Receipe("Avocado Toast", listOf(Ingredient("Whole Wheat Bread", 2f), Ingredient("Avocado", 1f), Ingredient("Eggs", 2f)),listOf(
                    "Toast slices of whole wheat bread until golden brown",
                    "Mash ripe avocado onto toasted bread slices",
                    "Season with salt, pepper, and any desired toppings (e.g., red pepper flakes, sliced tomatoes)",
                    "Serve immediately"
                )),
                lunch = Receipe("Turkey Sandwich", listOf(Ingredient("Turkey", 100f), Ingredient("Whole Wheat Bread", 2f), Ingredient("Lettuce", 50f)),listOf(
                    "Layer turkey slices and lettuce on one slice of whole wheat bread",
                    "Spread mustard or mayonnaise on another slice of bread",
                    "Top the sandwich with the second slice of bread",
                    "Cut sandwich in half diagonally",
                    "Serve immediately"
                )),
                dinner = Receipe("Vegetable Stir-fry with Rice", listOf(Ingredient("Mixed Vegetables", 200f), Ingredient("Rice", 150f), Ingredient("Soy Sauce", 50f)),listOf(
                    "Cook rice according to package instructions",
                    "Heat oil in a large skillet or wok over medium-high heat",
                    "Add mixed vegetables and stir-fry until tender-crisp",
                    "Season with soy sauce and any desired spices",
                    "Serve hot over cooked rice"
                )),
                snack = Receipe("Trail Mix", listOf(Ingredient("Nuts", 50f), Ingredient("Dried Fruit", 50f), Ingredient("Dark Chocolate", 30f)),listOf(
                    "Combine nuts, dried fruit, and dark chocolate in a large bowl",
                    "Toss to combine",
                    "Store in an airtight container for snacking"
                ))
            ),
            DayMenu(
                name = "Thursday",
                breakfast = Receipe("Smoothie Bowl", listOf(Ingredient("Banana", 1f), Ingredient("Frozen Berries", 100f), Ingredient("Spinach", 50f)),listOf(
                    "In a blender, combine banana, frozen berries, spinach, and any desired liquid (e.g., milk, yogurt, juice)",
                    "Blend until smooth and creamy",
                    "Pour into a bowl",
                    "Top with your favorite toppings (e.g., granola, sliced fruit, nuts)",
                    "Serve immediately"
                )),
                lunch = Receipe("Caprese Salad", listOf(Ingredient("Tomatoes", 100f), Ingredient("Fresh Mozzarella", 100f), Ingredient("Basil", 50f)),listOf(
                    "Slice tomatoes and fresh mozzarella into rounds",
                    "Arrange tomato and mozzarella slices on a plate, alternating",
                    "Drizzle with olive oil and balsamic glaze",
                    "Season with salt, pepper, and fresh basil leaves",
                    "Serve immediately"
                )),
                dinner = Receipe("Grilled Steak with Sweet Potato", listOf(Ingredient("Steak", 200f), Ingredient("Sweet Potato", 150f), Ingredient("Asparagus", 50f)),listOf(
                    "Season steak with salt, pepper, and any desired spices",
                    "Preheat grill to medium-high heat",
                    "Grill steak for 4-5 minutes per side for medium-rare",
                    "Let steak rest for 5 minutes before slicing",
                    "Meanwhile, peel and dice sweet potato",
                    "Toss sweet potato with olive oil, salt, and pepper",
                    "Roast sweet potato in the oven at 400°F (200°C) for 20-25 minutes or until tender",
                    "Serve grilled steak with roasted sweet potato and steamed asparagus"
                )),
                snack = Receipe("Cottage Cheese with Pineapple", listOf(Ingredient("Cottage Cheese", 150f), Ingredient("Pineapple", 100f)),listOf(
                    "Scoop cottage cheese into a bowl",
                    "Top with diced pineapple",
                    "Serve immediately"
                ))
            ),
            DayMenu(
                name = "Friday",
                breakfast = Receipe("Yogurt Parfait", listOf(Ingredient("Greek Yogurt", 150f), Ingredient("Granola", 50f), Ingredient("Berries", 50f)),listOf(
                    "In a glass or bowl, layer Greek yogurt, granola, and berries",
                    "Repeat layers until the glass or bowl is full",
                    "Top with additional berries or nuts if desired",
                    "Serve immediately"
                )),
                lunch = Receipe("Tuna Salad Sandwich", listOf(Ingredient("Canned Tuna", 100f), Ingredient("Whole Wheat Bread", 2f), Ingredient("Lettuce", 50f)),listOf(
                    "Drain canned tuna and transfer to a mixing bowl",
                    "Add mayonnaise, mustard, diced celery, and salt and pepper to taste",
                    "Stir until well combined",
                    "Spread tuna salad mixture onto one slice of whole wheat bread",
                    "Top with lettuce and another slice of bread",
                    "Cut sandwich in half diagonally",
                    "Serve immediately"
                )),
                dinner = Receipe("Pasta Primavera", listOf(Ingredient("Pasta", 150f), Ingredient("Mixed Vegetables", 200f), Ingredient("Parmesan Cheese", 50f)),listOf(
                    "Cook pasta according to package instructions",
                    "Meanwhile, heat oil in a large skillet over medium heat",
                    "Add mixed vegetables and sauté until tender-crisp",
                    "Add cooked pasta to the skillet",
                    "Season with salt, pepper, and any desired herbs or spices",
                    "Toss to combine",
                    "Serve hot with grated Parmesan cheese"
                )),
                snack = Receipe("Rice Cakes with Peanut Butter", listOf(Ingredient("Rice Cakes", 2f), Ingredient("Peanut Butter", 50f)),listOf(
                    "Spread peanut butter evenly onto rice cakes",
                    "Serve immediately"
                ))
            ),
            DayMenu(
                name = "Saturday",
                breakfast = Receipe("French Toast", listOf(Ingredient("Bread", 4f), Ingredient("Eggs", 2f), Ingredient("Milk", 100f)),listOf(
                    "In a shallow dish, whisk together eggs, milk, and cinnamon",
                    "Dip bread slices into the egg mixture, coating both sides",
                    "Heat a non-stick skillet or griddle over medium heat",
                    "Cook bread slices for 2-3 minutes per side or until golden brown",
                    "Serve hot with maple syrup or powdered sugar"
                )),
                lunch = Receipe("Vegetarian Burrito Bowl", listOf(Ingredient("Black Beans", 100f), Ingredient("Rice", 150f), Ingredient("Salsa", 50f)),listOf(
                    "Cook rice according to package instructions",
                    "In a large skillet, heat oil over medium heat",
                    "Add black beans and cook until heated through",
                    "Season beans with cumin, chili powder, and salt to taste",
                    "Assemble bowls with cooked rice, seasoned black beans, salsa, avocado, and any desired toppings",
                    "Serve hot"
                )),
                dinner = Receipe("Chicken Stir-fry with Noodles", listOf(Ingredient("Chicken Breast", 200f), Ingredient("Bell Peppers", 100f), Ingredient("Noodles", 150f)),listOf(
                    "Cook noodles according to package instructions",
                    "Meanwhile, heat oil in a large skillet or wok over medium-high heat",
                    "Add chicken breast strips and cook until browned and cooked through",
                    "Remove chicken from skillet and set aside",
                    "In the same skillet, add more oil if needed and stir-fry bell peppers and onions until tender-crisp",
                    "Add cooked noodles and cooked chicken back to the skillet",
                    "Season with soy sauce and any desired spices",
                    "Toss to combine",
                    "Serve hot"
                )),
                snack = Receipe("Carrot Sticks with Hummus", listOf(Ingredient("Carrot Sticks", 100f), Ingredient("Hummus", 50f)),listOf(
                    "Peel and cut carrots into sticks",
                    "Serve with hummus for dipping",
                    "Enjoy!"
                ))
            ),
            DayMenu(
                name = "Sunday",
                breakfast = Receipe("Egg Muffins", listOf(Ingredient("Eggs", 6f), Ingredient("Spinach", 50f), Ingredient("Cheese", 50f)),listOf(
                    "Preheat oven to 350°F (175°C)",
                    "Grease a muffin tin or line with paper liners",
                    "In a mixing bowl, beat eggs until well mixed",
                    "Stir in chopped spinach and shredded cheese",
                    "Pour egg mixture into prepared muffin tin, filling each cup about 3/4 full",
                    "Bake for 20-25 minutes or until muffins are set and lightly golden on top",
                    "Let cool for a few minutes before serving",
                    "Enjoy warm or at room temperature"
                )),
                lunch = Receipe("Mediterranean Wrap", listOf(Ingredient("Grilled Chicken", 100f), Ingredient("Hummus", 50f), Ingredient("Tomatoes", 50f)),listOf(
                    "Lay a tortilla flat on a clean surface",
                    "Spread hummus evenly over the tortilla",
                    "Layer grilled chicken, diced tomatoes, sliced cucumber, and crumbled feta cheese down the center of the tortilla",
                    "Drizzle with balsamic glaze",
                    "Fold in the sides of the tortilla, then roll up tightly",
                    "Cut the wrap in half diagonally",
                    "Serve immediately"
                )),
                dinner = Receipe("Shrimp Scampi with Pasta", listOf(Ingredient("Shrimp", 200f), Ingredient("Pasta", 150f), Ingredient("Garlic", 20f)),listOf(
                    "Cook pasta according to package instructions",
                    "Meanwhile, heat olive oil in a large skillet over medium heat",
                    "Add minced garlic and cook until fragrant",
                    "Add shrimp to the skillet and cook until pink and opaque",
                    "Season shrimp with salt, pepper, and red pepper flakes",
                    "Deglaze the skillet with white wine, if desired",
                    "Add cooked pasta to the skillet and toss to combine",
                    "Garnish with chopped parsley and lemon zest",
                    "Serve hot"
                )
                ),
                snack = Receipe("Mixed Nuts", listOf(Ingredient("Almonds", 30f), Ingredient("Cashews", 30f), Ingredient("Walnuts", 30f)),listOf(
                    "Combine almonds, cashews, and walnuts in a bowl",
                    "Toss to mix evenly",
                    "Serve as a snack or add to salads or trail mix"
                ))
            )
        )
    }
}