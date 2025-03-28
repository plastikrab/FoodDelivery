package com.example.fooddelivery.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R


@Composable
fun SocialLoginButtons() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Разделитель "OR"
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(1f).height(1.dp).background(Color.Gray.copy(alpha = 0.5f)))
            Text(
                text = "OR",
                modifier = Modifier.padding(horizontal = 8.dp),
                style = TextStyle(fontSize = 12.sp, color = Color.Gray)
            )
            Box(modifier = Modifier.weight(1f).height(1.dp).background(Color.Gray.copy(alpha = 0.5f)))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Кнопка "Continue with Google"
        Button(
            onClick = { /* Действия при нажатии */ },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF0F0F0)), // Светло-серый фон
            contentPadding = PaddingValues(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.google_logo), // Замените на ваш ресурс Google logo
                    contentDescription = "Google Logo",
                    modifier = Modifier.size(24.dp).padding(end = 8.dp)
                )
                Text(
                    text = "Continue with Google",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = Color.Black)
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Кнопка "Continue with Facebook"
        Button(
            onClick = { /* Действия при нажатии */ },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF0F0F0)), // Светло-серый фон
            contentPadding = PaddingValues(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.facebook_logo), // Замените на ваш ресурс Facebook logo
                    contentDescription = "Facebook Logo",
                    modifier = Modifier.size(24.dp).padding(end = 8.dp)
                )
                Text(
                    text = "Continue with Facebook",
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = Color.Black)
                )
            }
        }
    }
}