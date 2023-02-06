package com.example.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    soma()
                }
            }
        }
    }
}

@Composable
fun soma() {

    var firstNum = 0
    var secondNum = 0
    
    Column() {
        TextField(
            value = firstNum.toString(),
            onValueChange = { newValue ->
                firstNum = newValue.toIntOrNull() ?: 0
            }
        )
        TextField(
            value = secondNum.toString(),
            onValueChange = { newValue ->
                secondNum = newValue.toIntOrNull() ?: 0
            }
        )

        Text("The result is ${firstNum + secondNum}")
        
    }




}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IMCTheme {
        soma()
    }
}