package com.example.homescreen

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun upperpanel(){
    val context=LocalContext.current


    Column(
        verticalArrangement= Arrangement.Top,
        horizontalAlignment= Alignment.Start,
        modifier=Modifier.fillMaxWidth().padding(top=50.dp).background(Color(0xFF495E57))
    ){
        Text(
            text="Little Lemon",
            fontSize=32.sp,
            color= Color(0xFFF4CE14),
            modifier=Modifier.padding(start=20.dp, top=20.dp)
        )
        Text(
            text="Lahore",
            fontSize=24.sp,
            color=Color(0xFFFFFFFF) ,
            modifier=Modifier.padding(start=20.dp)


        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top=18.dp),
        ){
          Text(text=stringResource(id=R.string.description),
              color=Color.White,
              fontSize=18.sp,
              modifier=Modifier
                  .padding(bottom=28.dp,start=10.dp)
                  .fillMaxWidth(0.6f)

              )



            Image(
                painter=painterResource(id=R.drawable.upperpanelimg),
                contentDescription="",
                Modifier.size(400.dp,110.dp).clip(RoundedCornerShape(50.dp)).padding(horizontal=5.dp,vertical=10.dp)

            )

    }
        Button(
            onClick={
                    Toast.makeText(context,"order Complete!!",Toast.LENGTH_SHORT).show()
            },
            border= BorderStroke(1.dp,Color.Red),
            shape= RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),

            ){
            Text(text="order",color=Color.Black)
        }
}


}


@Preview(showBackground = true)
@Composable
fun upperpanelpreview() {
    upperpanel()
}