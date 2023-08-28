package com.example.laboratorio4

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivityPrincipal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting12("Android", context = this)
                }
            }
        }
    }
}

@Composable
fun Greeting12(name: String, modifier: Modifier = Modifier, context: Context? = null) {
    val image = painterResource(id = R.drawable.imagen_principal_universidad)
    val image2 = painterResource(id = R.drawable.pantalla_1)
    val image3 = painterResource(id = R.drawable.pantalla_2)
    val image4 = painterResource(id = R.drawable.pantalla_3)
    val image5 = painterResource(id = R.drawable.pantalla_4)
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "¡Bienvenid@ a la universidad!",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
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
        Image(
            painter = image2,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)
                .offset(y = 15.dp)
        )
        Button(onClick = {openMainActivity1(context)},
            modifier = Modifier
                .padding(top = 16.dp)) {
            androidx.compose.material3.Text(text = "Ir a Pantalla de Inicio")
        }
        Image(
            painter = image3,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)
                .offset(y = 15.dp)
        )
        Button(onClick = { openMainActivity2(context) },
            modifier = Modifier
                .padding(top = 16.dp)) {
            androidx.compose.material3.Text(text = "Ir a Pantalla de Perfil")
        }
        Image(
            painter = image4,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)
                .offset(y = 15.dp)
        )
        Button(onClick = { openMainActivity3(context) },
            modifier = Modifier
                .padding(top = 16.dp)) {
            androidx.compose.material3.Text(text = "Ir a Pantalla de Ajustes")
        }
        Image(
            painter = image5,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)
                .offset(y = 15.dp)
        )
        Button(onClick = { openMainActivity4(context) },
            modifier = Modifier
                .padding(top = 16.dp)) {
            androidx.compose.material3.Text(text = "Ir a Pantalla de Información para Emergencias")
        }
    }
}

private fun openMainActivity1(context: Context?) {
    val intent = Intent(context, MainActivity::class.java)
    context?.startActivity(intent)
}
private fun openMainActivity2(context: Context?) {
    val intent = Intent(context, MainActivity2::class.java)
    context?.startActivity(intent)
}
private fun openMainActivity3(context: Context?) {
    val intent = Intent(context, MainActivity3::class.java)
    context?.startActivity(intent)
}
private fun openMainActivity4(context: Context?) {
    val intent = Intent(context, MainActivity4::class.java)
    context?.startActivity(intent)
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun GreetingPreview12() {
    Laboratorio4Theme {
        Greeting12("Android")
    }
}