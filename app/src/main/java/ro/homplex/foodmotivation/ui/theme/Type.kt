package ro.homplex.foodmotivation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ro.homplex.foodmotivation.common.extensions.scaledSp


object DefaultType {
    val Regular20: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 20.scaledSp,
                lineHeight = 22.scaledSp
            )
        }
    val Regular18: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 18.scaledSp,
                lineHeight = 20.scaledSp
            )
        }
    val Regular14: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 14.scaledSp,
                lineHeight = 25.scaledSp
            )
        }

    val Regular12: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 12.scaledSp,
                lineHeight = 12.scaledSp
            )
        }
    val Bold33: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 33.scaledSp,
                lineHeight = 33.scaledSp
            )
        }

    val Bold24: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.scaledSp,
                lineHeight = 24.scaledSp
            )
        }
    val Bold20: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.scaledSp,
                lineHeight = 24.scaledSp
            )
        }

    val Bold18: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 18.scaledSp,
                lineHeight = 24.scaledSp
            )
        }

    val Bold14: TextStyle
        @Composable get() {
            return TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 14.scaledSp,
                lineHeight = 14.scaledSp
            )
        }
}

// Set of Material typography styles to start with
val Typography: Typography
    @Composable get() {
        return Typography(
            bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.scaledSp,
                lineHeight = 24.scaledSp,
                letterSpacing = 0.5f.scaledSp
            )
        )
    }