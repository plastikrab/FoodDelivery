package com.example.fooddelivery.presentation.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.fooddelivery.presentation.ui.components.FoodCard
import com.example.fooddelivery.presentation.ui.components.NameHeader
import com.example.fooddelivery.presentation.ui.components.SearchHeader
import com.example.fooddelivery.presentation.ui.components.SetCard
import com.example.fooddelivery.presentation.ui.theme.myTypography
import com.example.fooddelivery.presentation.viewModel.MainViewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel(),
    navController: NavController
) {
    val searchQuery by viewModel.searchQuery.observeAsState()
    val foodList by viewModel.foodList.observeAsState()


    Column(
        Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(40.dp))
        Column {
            NameHeader(
                modifier = modifier
                    .padding(16.dp)
            )
            SearchHeader(
                modifier = modifier
                    .padding(horizontal = 16.dp),
                searchQuery = searchQuery ?: "",
                onSearchQueryChanged = {
                    viewModel.setSearchQuery(it)
                }
            )

        }
        Spacer(Modifier.height(16.dp))
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Популярное",
                style = myTypography.h4,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                textAlign = TextAlign.Start
            )
            Text(
                text = "Все",
                style = myTypography.overline,
                modifier = Modifier
                    .padding(end = 22.dp)
                    .clickable{
                        navController.navigate("popular")
                    }
            )
        }
        Spacer(Modifier.height(10.dp))
        LazyRow() {
            items(foodList ?: emptyList()){foodItem ->
                FoodCard(foodItem = foodItem, onAddToCart = {})
            }
        }
        Spacer(Modifier.height(16.dp))
        Text(
            text = "Сеты",
            style = myTypography.h4,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Start
        )
        Spacer(Modifier.height(10.dp))
        LazyColumn {
            items(foodList ?: emptyList()){foodItem ->
                SetCard(
                    foodItem = foodItem,
                    onAddToCart = {},
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                )
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}