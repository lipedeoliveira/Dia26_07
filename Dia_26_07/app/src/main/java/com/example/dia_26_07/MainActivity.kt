package com.example.dia_26_07

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dia_26_07.ui.theme.Dia_26_07Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Dia_26_07Theme {
                Surface( modifier = Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.background ){
                    Tela()
                }
            }
        }
    }
}

@Composable
fun Tela() {
    var nome = ""
    Column(
        Modifier
            .background(Color.White)
    ) {

        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(

                text = "App DataBase",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center

        ) {
            TextField(

                value = nome,
                onValueChange = { nome = it },
                label = { Text(text = "Nome: ") }

            )

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center

        ) {
            TextField(

                value = nome,
                onValueChange = { nome = it },
                label = { Text(text = "Nome: ") }

            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun Telareview() {
    Dia_26_07Theme {
        Tela()
    }
}