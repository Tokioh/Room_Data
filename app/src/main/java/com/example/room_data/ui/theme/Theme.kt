package com.example.room_data.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimaryDark,
    onPrimary = OnBluePrimaryDark,
    primaryContainer = BluePrimaryContainerDark,
    onPrimaryContainer = OnBluePrimaryContainerDark,
    secondary = BlueSecondaryDark,
    onSecondary = OnBlueSecondaryDark,
    secondaryContainer = BlueSecondaryContainerDark,
    onSecondaryContainer = OnBlueSecondaryContainerDark,
    tertiary = BlueTertiaryDark,
    onTertiary = OnBlueTertiaryDark,
    tertiaryContainer = BlueTertiaryContainerDark,
    onTertiaryContainer = OnBlueTertiaryContainerDark,
    background = BlueBackgroundDark,
    surface = BlueSurfaceDark,
)

private val LightColorScheme = lightColorScheme(
    primary = BluePrimaryLight,
    onPrimary = OnBluePrimaryLight,
    primaryContainer = BluePrimaryContainerLight,
    onPrimaryContainer = OnBluePrimaryContainerLight,
    secondary = BlueSecondaryLight,
    onSecondary = OnBlueSecondaryLight,
    secondaryContainer = BlueSecondaryContainerLight,
    onSecondaryContainer = OnBlueSecondaryContainerLight,
    tertiary = BlueTertiaryLight,
    onTertiary = OnBlueTertiaryLight,
    tertiaryContainer = BlueTertiaryContainerLight,
    onTertiaryContainer = OnBlueTertiaryContainerLight,
    background = BlueBackgroundLight,
    surface = BlueSurfaceLight,
)

@Composable
fun Room_DataTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Disabled by default so the custom Blue palette is always visible
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
