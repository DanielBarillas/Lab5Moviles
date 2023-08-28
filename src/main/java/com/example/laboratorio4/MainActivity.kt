package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.firstimage)
    val image2 = painterResource(id = R.drawable.secondimage)
    val image3 = painterResource(id = R.drawable.thridimage)
    val image4 = painterResource(id = R.drawable.fourthimage)
    val image5 = painterResource(id = R.drawable.fifthimage)
    Column {
        Text(
            text = "Campus Central",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1.5F,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Text(
            text = "DESTACADOS",
            modifier = Modifier.padding(20.dp),
            color = Color.Gray,
            fontWeight = FontWeight.Bold
        )
        Row {
            Column(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = image2,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(165.dp)
                        .height(165.dp)
                )
                Surface (color = Color.Green,
                    modifier = Modifier
                        .width(165.dp)) {
                    Text(text = "Service Now",
                        modifier = Modifier
                            .width(180.dp),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = image3,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(165.dp)
                        .height(165.dp)
                )
                Surface (color = Color.DarkGray,
                    modifier = Modifier
                        .width(165.dp)) {
                    Text(text = "Actualidad UVG",
                        modifier = Modifier
                            .width(180.dp),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Text(
            text = "SERVICIOS Y RECURSOS",
            modifier = Modifier.padding(20.dp),
            color = Color.Gray,
            fontWeight = FontWeight.Bold

        )
        Row {
            Column(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = image4,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(165.dp)
                        .height(165.dp)
                )
                Surface (color = Color.Green,
                    modifier = Modifier
                        .width(165.dp)) {
                    Text(text = "Directorio de Servicios estudiantiles",
                        modifier = Modifier
                            .width(180.dp),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(modifier = Modifier.padding(8.dp)) {
                Image(
                    painter = image5,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(165.dp)
                        .height(165.dp)
                )
                Surface (color = Color.DarkGray,
                    modifier = Modifier
                        .width(165.dp)) {
                    Text(text = "Portal Web Bibliotecas UVG",
                        modifier = Modifier
                            .width(180.dp),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        Greeting("Android")
    }
}