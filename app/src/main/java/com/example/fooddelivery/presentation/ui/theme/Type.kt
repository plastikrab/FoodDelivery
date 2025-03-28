package com.example.fooddelivery.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = karlaFontFamily,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)


val myTypography = MyTypography(
    loginScreenTextField = TextStyle(
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    loginScreenTextFieldLabel = TextStyle(
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
    ),
    h4 = TextStyle( // "Welcome, Jabin"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.sp
    ),
    h5 = TextStyle( // "Popular"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle( // "Chicken fillet", "Rice noodles"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),
    body2 = TextStyle( // "Chicken, Mashroom", "Rice, Noodles"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 8.sp,
        letterSpacing = 0.sp
    ),
    caption = TextStyle( // "50 THB", "45 THB"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle( // "Sign Up", "Continue with Google", "Continue with Facebook"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        letterSpacing = 0.sp
    ),
    overline = TextStyle( // "OR"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.sp
    ),
    subtitle1 = TextStyle( // "Enter Name", "Enter Mobile No", "Email Address", "Password"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        letterSpacing = 0.sp,
        color = Color(0xFF323B42)
    ),
    subtitle2 = TextStyle( // "Jabin Larson", "+66 0-2333-0746", "jabin@domainurl.com", "de651e2d2"
        fontFamily = karlaFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        letterSpacing = 0.sp,
        color = Color(0xFF323B42)
    )
)