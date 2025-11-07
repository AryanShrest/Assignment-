package com.example.yango

import android.R
import android.content.pm.ModuleInfo
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yango.ui.theme.YangoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()

        }
    }
}
//UI
@Composable
fun MainBody(){
    Scaffold { padding ->
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(padding)
                .background(Color.Black)
        ){
            Row (
                modifier = Modifier.padding(top = 50.dp, start = 15.dp,end=15.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                Text("Recently played", style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Justify
                ))
                Spacer(modifier = Modifier.width(110.dp))
                Icon(
                    painter = painterResource(com.example.yango.R.drawable.notification),
                    contentDescription = null,
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    painter = painterResource(com.example.yango.R.drawable.outline_history_24),
                    contentDescription = null,
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(20
                    .dp))
                Icon(
                    painter = painterResource(com.example.yango.R.drawable.rounded_calendar_today_24),
                    null,
                    tint = Color.White
                )

            }
            
            Row (
                modifier = Modifier.fillMaxWidth().padding(top = 25.dp,start=15.dp,end=15.dp),
                verticalAlignment = Alignment.CenterVertically,

            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally


                ){
                    Image(
                        painter = painterResource(com.example.yango.R.drawable.girl),
                        null,
                        modifier = Modifier.height(100.dp).width(100.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop

                        )
                    Spacer(Modifier.height(10.dp))

                    Text("Lana del rey", style = TextStyle(
                        color = Color.White,

                    ))


                }
                Spacer(Modifier.width(20.dp))
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Image(
                        painter = painterResource(com.example.yango.R.drawable.boy),
                        null,
                        modifier = Modifier.height(100.dp).width(100.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop)
                    Spacer(Modifier.height(10.dp))
                    Text("Marvin gaye", style = TextStyle(
                        color = Color.White))
                }


            }
            Row (
                modifier = Modifier.padding(start = 20.dp, top = 30.dp, end = 20.dp),

            ){ Image(
                painter = painterResource(com.example.yango.R.drawable.image1),
                null,
                modifier = Modifier.height(80.dp).width(80.dp).clip(RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop)
            Column (
                modifier = Modifier.padding(start = 15.dp)
            ){
                Text("#SPOTIFYWRAPPED",style = TextStyle(
                    color = Color.Gray))

                Text("Your 2025 in review",style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold))
            }
            }
            Row(
                modifier = Modifier.padding(top = 20.dp, start = 20.dp)
            ){
                Column {
                    Image(
                        painter = painterResource(com.example.yango.R.drawable.image2),
                        null,
                        modifier = Modifier.height(130.dp).width(130.dp).clip(RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop)
                    Spacer(Modifier.height(10.dp))
                    Text("Your Top Songs 2021",style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold))

                }
                Spacer(Modifier.width(30.dp))
                Column {
                    Image(
                        painter = painterResource(com.example.yango.R.drawable.image3),
                        null,
                        modifier = Modifier.height(130.dp).width(130.dp).clip(RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop)
                    Spacer(Modifier.height(10.dp))
                    Text("Your Artists Revealed",style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,

                    ))


                }

            }
            Row (
                modifier = Modifier.padding(top=20.dp, start = 20.dp)
            ){
                Text("Editor's picks", style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                ))
            }
            Row (
                modifier = Modifier.padding(start=20.dp, top = 15.dp)
            ){
                Column {
                    Image(
                        painter = painterResource(com.example.yango.R.drawable.image5),
                        null,
                        modifier = Modifier.height(130.dp).width(130.dp).clip(RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop)
                    Spacer(Modifier.height(10.dp))
                    Text("Ed Sheeran, Big Sean,\n" +
                            "Juice WRLD, Post Malone",style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold))

                }
                Spacer(Modifier.width(10.dp))

                Column {Image(
                    painter = painterResource(com.example.yango.R.drawable.image6),
                    null,
                    modifier = Modifier.height(130.dp).width(130.dp).clip(RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop)
                    Spacer(Modifier.height(10.dp))
                    Text("Mitski, Tame Impala, Glass Animals, Charli XCX"
                        ,style = TextStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold))

                }



            }


            }
        }

}

@Preview
@Composable
fun previewBody(){
    MainBody()
}