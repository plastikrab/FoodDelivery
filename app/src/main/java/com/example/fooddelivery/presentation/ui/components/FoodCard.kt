package com.example.fooddelivery.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import com.example.fooddelivery.presentation.data.entities.FoodItem
import com.example.fooddelivery.presentation.ui.theme.interactiveOrange
import com.example.fooddelivery.presentation.ui.theme.myTypography

@Composable
fun FoodCard(
    foodItem: FoodItem,
    onAddToCart: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .width(130.dp)
            .size(130.dp, 180.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = foodItem.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .weight(2f),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
            ){
                Column {
                    Text(
                        text = foodItem.name,
                        style = myTypography.body1
                    )
                    Text(
                        text = foodItem.description,
                        style = myTypography.body2
                    )
                }
                Row(
                    Modifier.padding(top = 4.dp)
                ) {
                    Text(
                        text = foodItem.price,
                        style = myTypography.caption,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = onAddToCart,
                        modifier = Modifier
                            .size(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Add to Cart",
                            tint = Color.Black
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun Prev() {
    val foodItems = listOf(
        FoodItem(R.drawable.chicken_fillet, "Food Item 1", "Description 1", "$10"),
        FoodItem(R.drawable.chicken_noodle_soup, "Food Item 2", "Description 2", "$15"),
        FoodItem(R.drawable.tuna_rice, "Food Item 3", "Description 3", "$20")
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        foodItems.forEach {
            FoodCard(foodItem = it, onAddToCart = {})
        }
    }

}