package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.baseline_app_settings_alt_24)
    val image2 = painterResource(id = R.drawable._200px_biblioteca_montserrat)
    val image3 = painterResource(id = R.drawable.kisspng_computer_icons_user_clip_art_user_5abf13db5624e4_1771742215224718993529)
    val image4 = painterResource(id = R.drawable.baseline_assured_workload_24)
    val image5 = painterResource(id = R.drawable.baseline_people_24)
    val image6 = painterResource(id = R.drawable.baseline_calendar_month_24)
    val image7 = painterResource(id = R.drawable.baseline_collections_bookmark_24)
    val image8 = painterResource(id = R.drawable.baseline_grading_24)
    val image9 = painterResource(id = R.drawable.baseline_grain_24)
    val image10 = painterResource(id = R.drawable.baseline_edit_calendar_24)

    Column(modifier = modifier) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(modifier = Modifier.align(Alignment.CenterVertically)) {
                    Text(
                        text = "My Profile",
                        modifier = Modifier.offset(x = -110.dp),
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                    Image(
                        painter = image,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Green),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(35.dp)
                            .width(35.dp)
                    )
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .width(170.dp)
            .align(Alignment.Start)
        ) {
            Layout(
                content = {
                    Image(
                        painter = image2,
                        contentDescription = null,
                        alpha = 0.2F,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(5.dp)
                            .width(5.dp)
                    )

                    Image(
                        painter = image3,
                        contentDescription = null,
                        modifier = Modifier
                            .height(105.dp)
                            .width(200.dp)
                    )
                }
            ) { measurableList, constraints ->
                val placeables = measurableList.map { it.measure(constraints) }
                layout(constraints.maxWidth, constraints.maxHeight) {
                    placeables[0].place(0, 0) // Posición de la primera imagen
                    placeables[1].place(240, 280) // Posición de la segunda imagen (encima de la primera)
                }
            }
        }

        Text(
            text = "PABLO DANIEL BARILLAS MORENO",
            modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .offset(y = 20.dp),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
        Column {
            Divider(color = Color.Black, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image4,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column (modifier = Modifier.align(Alignment.CenterVertically)) {
                        Text(
                            text = "My Campus",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                        )
                        Text(
                            text = "Campus Central",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    }
                }
            }
        }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image5,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Friends",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image6,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Calendar",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image7,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Red),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Courses",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image8,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Grades",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image9,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Gropus",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
            Box{
                Row {
                    Image(
                        painter = image10,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.Blue),
                        modifier = Modifier
                            .height(55.dp)
                            .width(55.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                    Text(
                        text = "My Upcoming Events",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview2() {
    Laboratorio4Theme {
        Greeting2("Android")
    }
}