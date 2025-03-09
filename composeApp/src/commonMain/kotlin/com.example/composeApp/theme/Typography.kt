package com.example.composeApp.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import myportfolioapp.composeapp.generated.resources.Res
import myportfolioapp.composeapp.generated.resources.font_poppins_bold
import myportfolioapp.composeapp.generated.resources.font_poppins_medium
import myportfolioapp.composeapp.generated.resources.font_poppins_regular
import org.jetbrains.compose.resources.Font

@Composable
private fun PoppinsFontFamily() = FontFamily(
    Font(Res.font.font_poppins_regular, FontWeight.Normal),
    Font(Res.font.font_poppins_medium, FontWeight.Medium),
    Font(Res.font.font_poppins_bold, FontWeight.Bold),
)

@Composable
fun CustomTypography() = Typography().run {
    val poppins = PoppinsFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = poppins),
        displayMedium = displayMedium.copy(fontFamily = poppins),
        displaySmall = displaySmall.copy(fontFamily = poppins),
        headlineLarge = headlineLarge.copy(fontFamily = poppins),
        headlineMedium = headlineMedium.copy(fontFamily = poppins),
        headlineSmall = headlineSmall.copy(fontFamily = poppins),
        titleLarge = titleLarge.copy(fontFamily = poppins),
        titleMedium = titleMedium.copy(fontFamily = poppins),
        titleSmall = titleSmall.copy(fontFamily = poppins),
        bodyLarge = bodyLarge.copy(fontFamily = poppins),
        bodyMedium = bodyMedium.copy(fontFamily = poppins),
        bodySmall = bodySmall.copy(fontFamily = poppins),
        labelLarge = labelLarge.copy(fontFamily = poppins),
        labelMedium = labelMedium.copy(fontFamily = poppins),
        labelSmall = labelSmall.copy(fontFamily = poppins),
    )

}
