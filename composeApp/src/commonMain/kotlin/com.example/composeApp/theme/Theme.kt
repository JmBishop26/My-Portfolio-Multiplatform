package com.example.composeApp.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

val colorScheme = darkColorScheme(
    background = Colors.background,
    onBackground = Colors.onBackground,
    primary = Colors.primary,
    onPrimary = Colors.onPrimary,
    secondary = Colors.secondary,
    onSecondary = Colors.onSecondary,
    surface = Colors.surface,
    onSurface = Colors.onSurface,
    surfaceVariant = Colors.surfaceVariant,
    onSurfaceVariant = Colors.onSurfaceVariant
)

@Composable
fun CustomTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = CustomTypography(),
        content = content
    )
}
