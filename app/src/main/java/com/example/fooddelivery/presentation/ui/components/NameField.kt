package com.example.fooddelivery.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.presentation.ui.theme.myTypography

@Composable
fun NameField(
    modifier: Modifier = Modifier,
    textFieldValue: String,
    onTextChanged: (String) -> Unit = {},
    isPassword: Boolean = false,
    labelText: String = ""
) {
    OutlinedTextField(
        value = textFieldValue,
        onValueChange = {
            onTextChanged(it)
        },
        placeholder = {
            Text(labelText, style = myTypography.subtitle1)
                      },
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        textStyle = myTypography.subtitle2,
        singleLine = true,
        colors = OutlinedTextFieldDefaults.colors(
            disabledBorderColor = Color(0xFFE5E5E5),
            focusedBorderColor = Color(0xFFE5E5E5),
            unfocusedBorderColor = Color(0xFFE5E5E5),

            focusedContainerColor = Color(0xFFFFFFFF),
            unfocusedContainerColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color(0xFFFFFFFF),

            unfocusedPrefixColor = Color(0xFFFFFFFF),
            focusedLabelColor = Color(0xFFFFFFFF),
            disabledLabelColor = Color(0xFFFFFFFF),
        )
    )
}

@Preview
@Composable
private fun Prev() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Screen",
            style = myTypography.h4
        )
        NameField(
            textFieldValue = "name",
            onTextChanged = {
            },
            labelText = "Введите Имя"
        )
        NameField(
            textFieldValue = "phoneNumber",
            onTextChanged = {
            },
            labelText = "Введите номер телефона"
        )
        NameField(
            textFieldValue = "email",
            onTextChanged = {
            },
            labelText = "Введите Email"
        )
        NameField(
            textFieldValue = "password",
            onTextChanged = {
            },
            labelText = "Введите пароль",
            isPassword = true
        )

    }
}