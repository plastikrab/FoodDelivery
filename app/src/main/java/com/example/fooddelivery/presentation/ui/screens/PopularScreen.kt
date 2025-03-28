package com.example.fooddelivery.presentation.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.fooddelivery.presentation.ui.components.FoodCard
import com.example.fooddelivery.presentation.ui.components.FoodCardBig
import com.example.fooddelivery.presentation.ui.components.SearchHeader
import com.example.fooddelivery.presentation.ui.theme.myTypography
import com.example.fooddelivery.presentation.viewModel.MainViewModel

@Composable
fun PopularScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {},
    viewModel: MainViewModel = hiltViewModel(),
    navController: NavController
) {
    val foodList by viewModel.foodList.observeAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(16.dp))
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = "Search",
            modifier = Modifier
                .align(Alignment.Start)
                .size(30.dp)
                .clickable {
                    navController.navigate("main")
                }
        )
        Text(
            text = "Popular",
            modifier = Modifier,
            style = myTypography.h4
        )
        Spacer(Modifier.height(16.dp))
        SearchHeader()
        Spacer(Modifier.height(16.dp))
        LazyColumn {
            items(foodList ?: emptyList()) { foodItem ->
                FoodCardBig(foodItem = foodItem)
            }
        }
    }

}