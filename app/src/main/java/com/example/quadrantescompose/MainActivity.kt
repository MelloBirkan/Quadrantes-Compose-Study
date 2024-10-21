package com.example.quadrantescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescompose.ui.theme.QuadrantesComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      QuadrantesComposeTheme {
        Surface(Modifier.fillMaxSize()) {
          ContentView()
        }
      }
    }
  }
}

@Composable
fun ContentView() {
  Column(Modifier.fillMaxSize()) {
    Row(Modifier.weight(1f)) {
      Card(
        "Text composable",
        "Displays text and follows the recommended Material Design guidelines.",
        Color(0xFFEADDFF),
        modifier = Modifier.weight(1f)
      )

      Card(
        "Image composable",
        "Creates a composable that lays out and draws a given Painter class object.",
        Color(0xFFD0BCFF),
        modifier = Modifier.weight(1f)
      )
    }

    Row(Modifier.weight(1f)) {
      Card(
        "Row composable",
        "A layout composable that places its children in a horizontal sequence.",
        Color(0xFFB69DF8),
        modifier = Modifier.weight(1f)
      )

      Card(
        "Column composable",
        "A layout composable that places its children in a vertical sequence.",
        Color(0xFFF6EDFF),
        modifier = Modifier.weight(1f)
      )
    }
  }
}

@Composable
fun Card(title: String, description: String, color: Color, modifier: Modifier = Modifier) {
  Column(
    modifier
      .fillMaxSize()
      .background(color)
      .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Text(
      title,
      fontWeight = FontWeight.Bold,
      modifier = Modifier
        .padding(bottom = 16.dp)
    )

    Text(
      description,
      fontFamily = FontFamily.Default
    )
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  QuadrantesComposeTheme {
    Surface(Modifier.fillMaxSize()) {
      ContentView()
    }
  }
}