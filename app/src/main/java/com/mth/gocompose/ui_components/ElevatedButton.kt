package com.mth.gocompose.ui_components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mth.gocompose.ui.theme.Purple40

/**
 * @Author myothiha
 * Created 16/08/2023 at 3:50 PM.
 **/

@Composable
fun ElevatedButton(modifier: Modifier = Modifier) {
    androidx.compose.material3.ElevatedButton(
        onClick = {},
        modifier.fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Purple40)
    ) {
        Text(text = "Show Button Sheet")
    }
}