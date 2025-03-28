package com.example.fooddelivery.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.fooddelivery.presentation.ui.components.NameField
import com.example.fooddelivery.presentation.ui.components.SocialLoginButtons
import com.example.fooddelivery.presentation.ui.theme.interactiveOrange
import com.example.fooddelivery.presentation.ui.theme.myTypography
import com.example.fooddelivery.presentation.viewModel.MainViewModel

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel(),
    navController: NavController
) {
    val name by viewModel.name.observeAsState("")
    val phoneNumber by viewModel.phoneNumber.observeAsState("")
    val email by viewModel.email.observeAsState("")
    val password by viewModel.password.observeAsState("")

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(64.dp))
        Text(
            text = "Регестрация аккаунта",
            style = myTypography.h4
        )
        Spacer(Modifier.height(10.dp))
        NameField(
            textFieldValue = name,
            onTextChanged = {
                viewModel.setName(it)
            },
            labelText = "Введите Имя"
        )
        NameField(
            textFieldValue = phoneNumber,
            onTextChanged = {
                viewModel.setPhoneNumber(it)
            },
            labelText = "Введите номер телефона"
        )
        NameField(
            textFieldValue = email,
            onTextChanged = {
                viewModel.setEmail(it)
            },
            labelText = "Введите Email"
        )
        NameField(
            textFieldValue = password,
            onTextChanged = {
                viewModel.setPassword(it)
            },
            labelText = "Введите пароль",
            isPassword = true
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            buildAnnotatedString {
                append("Продолжая, я подтверждаю, что прочитал и согласен с ")
                withStyle(style = SpanStyle(color = interactiveOrange, fontWeight = FontWeight.Bold)) {
                    append("Условия и Положения")
                }
                append(" и ")
                withStyle(style = SpanStyle(color = interactiveOrange, fontWeight = FontWeight.Bold)) {
                    append("политика конфиденциальности")
                }
                append(".")
            },
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            style = myTypography.overline
        )
        Spacer(modifier = Modifier.height(22.dp))
        Button(
            onClick = {
                navController.navigate("main")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp), // Добавляем отступы вокруг кнопки
            shape = RoundedCornerShape(12.dp), // Делаем углы закругленными
            colors = ButtonDefaults.buttonColors(containerColor = interactiveOrange) // Устанавливаем оранжевый цвет фона
        ) {
            Text(
                text = "Зарегестрироваться",
                style = myTypography.button
            )
        }
        Spacer(Modifier.height(16.dp))
        SocialLoginButtons()
    }
}