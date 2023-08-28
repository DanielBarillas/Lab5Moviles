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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
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

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.baseline_clear_24)
    val image1 = painterResource(id = R.drawable.baseline_person_2_24)
    val image2 = painterResource(id = R.drawable.baseline_mail_24)
    val image3 = painterResource(id = R.drawable.baseline_notifications_active_24)
    val image4 = painterResource(id = R.drawable.baseline_private_connectivity_24)
    val image6 = painterResource(id = R.drawable.baseline_help_center_24)
    val image7 = painterResource(id = R.drawable.baseline_priority_high_24)

    Column(modifier = modifier) {
        Row(modifier = Modifier
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
                text = "Settings",
                modifier = Modifier
                    .offset(x = 110.dp)
                    .offset(y = 10.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                    )
                )
            }
        Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
        Box{
            Row {
                Image(
                    painter = image1,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.DarkGray),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                Text(
                    text = "Edit Profile",
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
                    painter = image2,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Green),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                Text(
                    text = "Email Addresses",
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
                    painter = image3,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Red),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                Text(
                    text = "Notifications",
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
                    painter = image4,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.LightGray),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                Text(
                    text = "Privacy",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
        Spacer(modifier = Modifier
            .width(20.dp)
            .size(20.dp))
        Box{
            Row {
                Image(
                    painter = image6,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Red),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto
                Column (modifier = Modifier.align(Alignment.CenterVertically)) {
                    Text(
                        text = "Help and Feedback",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Troubleshooting tips and guides",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                }
            }
        }
        Divider(color = Color.Gray, modifier = Modifier.padding(vertical = 5.dp))
        Box{
            Row {
                Image(
                    painter = image7,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Blue),
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                )

                Spacer(modifier = Modifier.width(16.dp)) // Agregar espacio entre la imagen y el texto

                Column (modifier = Modifier.align(Alignment.CenterVertically)) {
                    Text(
                        text = "About",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "App information and documents",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Black
                    )
                }
            }
        }
        Spacer(modifier = Modifier
            .width(20.dp)
            .size(20.dp))
        Box{
            Row {
                Text(
                    text = "Logout",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                        .offset(x = 160.dp)

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
fun GreetingPreview3() {
    Laboratorio4Theme {
        Greeting3("Android")
    }
}