package com.example.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        LazyRow {
            items(listOf("Indian", "Chinese", "Italian", "Mexican","american","British")) { category ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(
                        text = category,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(8.dp)
                    )
                }
            }
        }
Menudish()
    }
}


@Composable
fun WeeklySpecialCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Weekly Special",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}
    @Composable
    fun Menudish() {
        LazyColumn {
            items(
                listOf(
                    "Chicken Tikka Masala",
                    "Butter Chicken",
                    "Biryani",
                    "Naan",
                    "Samosa",
                    "Palak Paneer",
                    "Dosa",
                )
            ) { dish ->
                Card {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Column {
                            Image(
                                painter = painterResource(
                                    id = when (dish) {
                                        "Chicken Tikka Masala" -> R.drawable.chicken
                                        "Butter Chicken" -> R.drawable.butter_chicken
                                        "Biryani" -> R.drawable.biryani
                                        "Naan" -> R.drawable.naan
                                        "Samosa" -> R.drawable.samosa
                                        "Palak Paneer" -> R.drawable.palak_paneer
                                        "Dosa" -> R.drawable.dosa
                                        else -> R.drawable.chicken
                                    }
                                ),
                                contentDescription = "",
                            )
                            Text(
                                text = dish,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "A delicious and flavorful dish of ${dish}.",
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(top = 5.dp, bottom = 5.dp)
                                    .fillMaxWidth(.75f)
                            )
                            Text(
                                text = "$${(10..25).random()}",
                                color = Color.Gray,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Divider(
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                        color = Color.LightGray,
                        thickness = 1.dp
                    )
                }
            }
        }
    }
