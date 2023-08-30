package com.example.homescreen
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderScreen(navController: NavHostController) {

    Scaffold(
        topBar = {


            TopAppBar(title = {
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(painterResource(id = R.drawable.logo),"menu",
                        modifier= Modifier
                            .size(150.dp)
                            .align(Alignment.Center)
                            .padding(end = 40.dp)
                    )


                }
                Box(modifier=Modifier.fillMaxWidth()) {
                    Button(
                        onClick = {
                        },
                        colors=ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier= Modifier
                            .align(BottomEnd)
                            .size(110.dp)
                            .padding(top = 35.dp)

                    ){Image(
                        painterResource(id = R.drawable.cart), contentDescription = "cart"
                        ,modifier = Modifier
                            .size(110.dp)
                            .padding(top = 10.dp)

                    )}
                }},


                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(TopAppBar.route)
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Menu"
                        )
                    }
                }


            )
        }
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
        ) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                ) {
                    Column {
                        Text(
                            text = "Greek Salad",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "The famous greek salad of " +
                                    "crispy lettuce, peppers, olives, " +
                                    "our Chicago ...",
                            modifier = Modifier
                                .padding(top = 5.dp, bottom = 5.dp)
                                .fillMaxWidth(.75f)
                        )
                        Text(
                            text = "$12.99",
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                }
            }
            val sheetState= rememberModalBottomSheetState()
            var isSheetOpen by rememberSaveable {
                mutableStateOf(false)
            }
            Button(
                onClick = {
                          isSheetOpen=true
                },
                modifier = Modifier.padding(8.dp),


            ) {
                Text(text = "Conform order")
            }
            if(isSheetOpen) {
                ModalBottomSheet(sheetState = sheetState, onDismissRequest = { isSheetOpen=false }
                ) {
                    Image(painter = painterResource(id =R.drawable.tick), null,
                        modifier=Modifier
                            .align(CenterHorizontally)
                            .padding(top=40.dp)
                    )
                    Text(text = "Order is Conformed",

                        modifier=Modifier
                            .align(CenterHorizontally)
                            .padding(top=10.dp),
                        fontWeight = FontWeight.Bold

                    )
                    Text(text = "Order No. #56954",
                        modifier=Modifier
                            .align(CenterHorizontally)
                            .padding(bottom=40.dp),
                        fontWeight= FontWeight.ExtraBold

                    )

                }
            }


        }
    }
}




