package com.shpak.aurora.forecast.alerts

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(0.5f)
                .align(Alignment.Center)
        ) {
            RadialGradientCanvas()
        }
    }
}

@Composable
fun RadialGradientCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    Color.Cyan,
                    Color.Blue,
                    Color.Black
                ),
                center = center,
                radius = size.minDimension / 1.2f
            ),
            radius = size.maxDimension
        )
    }
}