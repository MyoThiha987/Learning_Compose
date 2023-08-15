package com.mth.gocompose.ui_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mth.gocompose.R

/**
 * @Author myothiha
 * Created 15/08/2023 at 2:05 PM.
 **/


@Composable
fun RowAndColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val borderColorBrush = remember {
                Brush.sweepGradient(
                    listOf(
                        Color(0xFF9575CD),
                        Color(0xFFBA68C8),
                        Color(0xFFE57373),
                        Color(0xFFFFB74D),
                        Color(0xFFFFF176),
                        Color(0xFFAED581),
                        Color(0xFF4DD0E1),
                        Color(0xFF9575CD)
                    )
                )
            }


            Box() {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "",
                    modifier = Modifier
                        .size(50.dp)
                        .border(border = BorderStroke(1.dp, borderColorBrush), shape = CircleShape)
                        .padding(2.dp)
                        .clip(CircleShape)
                )
                Icon(
                    Icons.Filled.CheckCircle,
                    contentDescription = "Check mark",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(width = 20.dp, height = 20.dp)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(horizontal = 12.dp), // Adjust the padding to move the text to the start
                verticalArrangement = Arrangement.Top, // Align text content vertically to the start
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Welcome",
                    fontSize = 12.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Myo Thiha is android developer from mayanmar and currently works at Tunity",
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }


            // Icon
            Icon(
                Icons.Default.Settings,
                contentDescription = "Setting",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .align(Alignment.Top)
            )
        }

        Spacer(modifier = modifier.size(16.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_nature),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .aspectRatio(1f)
                .size(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = modifier.size(16.dp))

        Divider(
            modifier = modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.Gray.copy(alpha = 0.6f)
        )

        Spacer(modifier = modifier.size(16.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(
                modifier = modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = "Image Like"
                )

                Text(text = "Like", modifier = modifier.padding(horizontal = 8.dp))
            }

            Row(
                modifier = modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = "Image Comment"
                )

                Text(text = "Comment", modifier = modifier.padding(horizontal = 8.dp))
            }

            Row(
                modifier = modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_share),
                    contentDescription = "Image Share"
                )

                Text(text = "Share", modifier = modifier.padding(horizontal = 8.dp))
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun RowAndColumnPreview() {
    Column(modifier = Modifier.fillMaxWidth()) {
        RowAndColumn()
    }


}