package com.example.fooddelivery.presentation.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.fooddelivery.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.fonts_certs
)


val karlaFont = GoogleFont("Cousine")
val karlaFontFamily = FontFamily(Font(googleFont = karlaFont, fontProvider = provider))