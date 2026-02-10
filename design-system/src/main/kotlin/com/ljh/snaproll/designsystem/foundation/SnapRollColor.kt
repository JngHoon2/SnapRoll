package com.ljh.snaproll.designsystem.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

object SnapRollColors {
    // Film Inspired Colors
    val KodakGold = Color(0xFFFFB800)
    val KodakRed = Color(0xFFE30613)
    val FujiGreen = Color(0xFF008937)
    val IlfordGray = Color(0xFF4A4A4A)
    
    // System Colors
    val White = Color(0xFFFFFFFF)
    val Black = Color(0xFF1A1A1A)
    val Gray100 = Color(0xFFF5F5F5)
    val Gray200 = Color(0xFFE0E0E0)
    val Gray300 = Color(0xFFBDBDBD)
    val Gray400 = Color(0xFF9E9E9E)
    val Gray500 = Color(0xFF757575)
    val Gray600 = Color(0xFF616161)
    val Gray700 = Color(0xFF424242)
    val Gray800 = Color(0xFF212121)
    
    val Error = Color(0xFFD32F2F)
    val Warning = Color(0xFFFFA000)
    val Success = Color(0xFF388E3C)
    val Info = Color(0xFF1976D2)
    
    val Disable = Color(0xFFE0E0E0)
    val OnDisable = Color(0xFF9E9E9E)
}

@Immutable
data class SnapRollColorScheme(
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val error: Color,
    val onError: Color,
    val isLight: Boolean
)

val LightColorScheme = SnapRollColorScheme(
    primary = SnapRollColors.KodakGold,
    onPrimary = SnapRollColors.Black,
    secondary = SnapRollColors.FujiGreen,
    onSecondary = SnapRollColors.White,
    background = SnapRollColors.White,
    onBackground = SnapRollColors.Black,
    surface = SnapRollColors.Gray100,
    onSurface = SnapRollColors.Black,
    error = SnapRollColors.Error,
    onError = SnapRollColors.White,
    isLight = true
)

val DarkColorScheme = SnapRollColorScheme(
    primary = SnapRollColors.KodakGold,
    onPrimary = SnapRollColors.Black,
    secondary = SnapRollColors.FujiGreen,
    onSecondary = SnapRollColors.White,
    background = SnapRollColors.Black,
    onBackground = SnapRollColors.White,
    surface = SnapRollColors.Gray800,
    onSurface = SnapRollColors.White,
    error = SnapRollColors.Error,
    onError = SnapRollColors.White,
    isLight = false
)

val LocalSnapRollColorScheme = staticCompositionLocalOf { LightColorScheme }
