package com.example.fooddelivery.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.presentation.data.entities.FoodItem
import com.example.fooddelivery.presentation.ui.theme.myTypography

@Composable
fun SetCard(
    modifier: Modifier = Modifier,
    onAddToCart: () -> Unit = {},
    foodItem: FoodItem
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = White
        )
    ) {
        Column {
            Image(
                painter = painterResource(id = foodItem.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop,

            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .padding(top = 10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = foodItem.name,
                        style = myTypography.h4
                    )
                    Text(
                        text = foodItem.description,
                        style = myTypography.body1
                    )
                }
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add to Cart",
                    modifier = Modifier
                        .height(50.dp)
                )
            }

        }
    }
}