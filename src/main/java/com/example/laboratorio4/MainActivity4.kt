package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.baseline_clear_24)
    val image1 = painterResource(id = R.drawable.baseline_emergency_24)
    val image2 = painterResource(id = R.drawable.baseline_phone_forwarded_24)
    val image3 = painterResource(id = R.drawable.ultimate)

    Column(modifier = modifier) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = image,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Green),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(35.dp)
                    .width(35.dp)
                    .align(Alignment.CenterVertically)
            )

            Text(
                text = "Emergency Contacts",
                modifier = Modifier
                    .offset(x = 60.dp)
                    .offset(y = 10.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 1.dp))
        Box{
            Row {
                Image(
                    painter = image1,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Red),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .offset(y = 25.dp, x = 12.dp)
                )

                Spacer(modifier = Modifier.width(11.dp)) // Agregar espacio entre la imagen y el texto

                Column (modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(20.dp)) {
                    Text(
                        text = "Emergencias",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Si se presenta un accidente o un percance por favor marca al número de emergencia y rápidamente te apoyaremos",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                }
            }
        }
        Column {
                Row {
                    Surface(
                        color = Color.Green,
                        modifier = Modifier
                            .width(387.dp)
                            .padding(15.dp)
                    ) {
                        Image(
                            painter = image2,
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = Modifier
                                .height(55.dp)
                                .width(55.dp)
                                .offset(y = 0.dp, x = -155.dp)
                        )
                        Text(
                            text = "Call 5978-1736",
                            modifier = Modifier
                                .width(200.dp)
                                .offset(y = 15.dp, x = 70.dp),
                            fontSize = 15.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                }
            }
        }
        Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 1.dp))
        Box{
            Row {
                Image(
                    painter = image3,
                    contentDescription = null,
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .offset(y = 25.dp, x = 12.dp)
                )

                Spacer(modifier = Modifier.width(11.dp)) // Agregar espacio entre la imagen y el texto

                Column (modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(20.dp)) {
                    Text(
                        text = "Clínica UVG",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "La Clínica UVG, presta los siguientes servicios: ",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                    Spacer(modifier = Modifier
                        .width(10.dp)
                        .size(10.dp))
                    Text(
                        text = "◉ Atención a Emergencias",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                    Text(
                        text = "◉ Atención Primario a Enfermedades Comunes",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                    Text(
                        text = "◉ Plan Educacional sobre Enfermedades",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                    Spacer(modifier = Modifier
                        .width(10.dp)
                        .size(10.dp))
                    Text(
                        text = "Horario de atención: 7:00 a.m. a 8:30 p.m.",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                    Text(
                        text = "Campus Central Edificio F 119 - 120",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        lineHeight = 14.sp
                    )
                }
            }
        }
        Column {
            Row {
                Surface(
                    color = Color.Green,
                    modifier = Modifier
                        .width(387.dp)
                        .padding(15.dp)
                ) {
                    Image(
                        painter = image2,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                            .offset(y = 0.dp, x = -155.dp)
                    )
                    Text(
                        text = "Call 2507-1500 ex 21312",
                        modifier = Modifier
                            .width(200.dp)
                            .offset(y = 15.dp, x = 70.dp),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 1.dp))
    }
}

@Preview(showBackground = true,
        showSystemUi = true
)
@Composable
fun GreetingPreview4() {
    Laboratorio4Theme {
        Greeting4("Android")
    }
}