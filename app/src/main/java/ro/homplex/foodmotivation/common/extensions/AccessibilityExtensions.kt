package ro.homplex.foodmotivation.common.extensions

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

val Int.scaledSp: TextUnit
    @Composable get() = scaledSp()

@Composable
fun Int.scaledSp(): TextUnit {
    val value: Int = this
    return with(LocalDensity.current) {
        val fontScale = this.fontScale
        val textSize = value / fontScale
        textSize.sp
    }
}

val Float.scaledSp: TextUnit
    @Composable get() = scaledSp()

@Composable
fun Float.scaledSp(): TextUnit {
    val value: Float = this
    return with(LocalDensity.current) {
        val fontScale = this.fontScale
        val textSize = value / fontScale
        textSize.sp
    }
}