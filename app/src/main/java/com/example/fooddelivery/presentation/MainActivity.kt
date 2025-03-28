package com.example.fooddelivery.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddelivery.presentation.ui.screens.LoginScreen
import com.example.fooddelivery.presentation.ui.screens.MainScreen
import com.example.fooddelivery.presentation.ui.screens.PopularScreen
import com.example.fooddelivery.presentation.ui.theme.FoodDeliveryTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            FoodDeliveryTheme {
                NavHost(
                    navController = navController,
                    startDestination = "login"
                ){
                    composable("main"){
                        MainScreen(navController = navController)
                    }
                    composable("popular") {
                        PopularScreen(navController = navController)
                    }
                    composable("login") {
                        LoginScreen(navController = navController)
                    }
                }
            }
        }
    }
}