package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(modifier = Modifier.background(Color.Red)) {
        Text(
            text = "Hello World!",
            modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
        )
        Text(
            text = "Outra coisa escrita",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
        )

        Row(modifier = Modifier.background(Color.White)) {
            Text(
                text = "Text 3",
                modifier = Modifier
                    .weight(2f, true),
                textAlign = TextAlign.Center,
            )
            Text(
                text = "Text 4",
                modifier = Modifier
                    .weight(2f),
                textAlign = TextAlign.Center
            )


        }
    }


}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ComposeTheme {
        MainScreen()

    }
}