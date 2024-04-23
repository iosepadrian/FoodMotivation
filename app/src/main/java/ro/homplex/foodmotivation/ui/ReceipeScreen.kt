package ro.homplex.foodmotivation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import ro.homplex.foodmotivation.data.DayMenu

@Composable
fun ReceipeScreen(navController: NavController, dayMenu: DayMenu) {
    Surface {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Text(
                text = "This is your menu for today",
                Modifier.align(CenterHorizontally),
                textAlign = TextAlign.Center,
                color = Color.Black, // Change color as needed
                fontWeight = FontWeight.Bold
            )
        }
    }
}