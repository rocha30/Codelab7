package com.example.codelab_7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
class WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Text (
        text = "Haz tomado $count vasos. ",
        modifier = modifier.padding(16.dp)
    )
}