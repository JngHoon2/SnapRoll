package com.ljh.snaproll.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.ljh.snaproll.designsystem.foundation.DarkColorScheme
import com.ljh.snaproll.designsystem.foundation.LightColorScheme
import com.ljh.snaproll.designsystem.foundation.LocalSnapRollColorScheme
import com.ljh.snaproll.designsystem.foundation.LocalSnapRollTypography
import com.ljh.snaproll.designsystem.foundation.SnapRollColorScheme
import com.ljh.snaproll.designsystem.foundation.SnapRollTypography
import com.ljh.snaproll.designsystem.foundation.SnapRollTypographyDefault

object SnapRollTheme {
    val colors: SnapRollColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalSnapRollColorScheme.current

    val typography: SnapRollTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSnapRollTypography.current
}

@Composable
fun SnapRollTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val typography = SnapRollTypographyDefault

    CompositionLocalProvider(
        LocalSnapRollColorScheme provides colorScheme,
        LocalSnapRollTypography provides typography
    ) {
        content()
    }
}
