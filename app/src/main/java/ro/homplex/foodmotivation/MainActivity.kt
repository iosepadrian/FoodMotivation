package ro.homplex.foodmotivation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ro.homplex.foodmotivation.data.DayMenu
import ro.homplex.foodmotivation.ui.DashboardScreen
import ro.homplex.foodmotivation.ui.theme.FoodMotivationTheme

class MainActivity : ComponentActivity() {
    companion object {
        const val DASHBOARD_SCREEN = "dashboard_screen"
    }
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodMotivationTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = DASHBOARD_SCREEN
                ) {
                    composable(DASHBOARD_SCREEN) {
                        DashboardScreen(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FoodMotivationTheme {
        Greeting("Android")
    }
}