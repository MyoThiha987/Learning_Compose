package com.mth.gocompose.ui_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @Author myothiha
 * Created 14/08/2023 at 4:54 PM.
 **/

@Composable
fun createColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Hi",
            modifier = modifier
                .background(color = Color.Cyan)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally)
                //.weight(1f)
                ,
            fontSize = 24.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = modifier
                .background(color = Color.Green)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally),
                //.weight(1f),
            text = "Hello",
            fontSize = 24.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = modifier
                .background(color = Color.Gray)
                .wrapContentHeight()
                .align(Alignment.CenterHorizontally),
                //.weight(1f),
            text = "Hello",
            fontSize = 24.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Start){
        createColumn()
    }

}