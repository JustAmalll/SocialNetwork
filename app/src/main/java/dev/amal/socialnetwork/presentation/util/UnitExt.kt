package dev.amal.socialnetwork.presentation.util

import android.content.res.Resources
import android.util.TypedValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Dp.toPx(): Float = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,
    this.value,
    Resources.getSystem().displayMetrics
)

fun Float.toDp(): Dp = (this / Resources.getSystem().displayMetrics.density).dp
