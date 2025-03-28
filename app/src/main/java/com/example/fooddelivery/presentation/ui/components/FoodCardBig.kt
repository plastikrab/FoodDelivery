package com.example.fooddelivery.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.presentation.data.entities.FoodItem
import com.example.fooddelivery.presentation.ui.theme.myTypography

@Composable
fun FoodCardBig(
    modifier: Modifier = Modifier,
    foodItem: FoodItem
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = foodItem.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .weight(2.5f)
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = foodItem.name,
                    style = myTypography.h5
                )
                Text(
                    text = foodItem.description,
                    style = myTypography.body1,
                    modifier = Modifier.padding(vertical = 6.dp)
                )
                Text(
                    text = foodItem.price,
                    style = myTypography.caption
                )
            }
        }
    }
}