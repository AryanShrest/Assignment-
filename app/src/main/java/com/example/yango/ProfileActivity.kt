package com.example.yango

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yango.ui.theme.YangoTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold { padding ->
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues = padding)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 24.dp, start = 16.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,

                ) {


                Icon(
                    painter = painterResource(R.drawable.outline_arrow_back_ios_24),

                    contentDescription = null
                )
                Text(
                    text = "Aryan Shrestha", style = TextStyle(
                        fontWeight = FontWeight.Bold
                    )
                )
                Icon(
                    painter = painterResource(R.drawable.baseline_more_vert_24),
                    contentDescription = null
                )
            }
            Row (modifier = Modifier.fillMaxWidth().padding(start = 15.dp,end=15.dp, top = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween){
                Image(
                    painter = painterResource(R.drawable.aryan),
                    contentDescription = null,
                    modifier = Modifier.height(100.dp).width(100.dp).clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("715", fontWeight = FontWeight.Bold)
                    Text("Posts")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text("1M", fontWeight = FontWeight.Bold)
                    Text("Followers")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text("0", fontWeight = FontWeight.Bold)
                    Text("Followers")
                }

            }
            Column (
                modifier = Modifier.padding(top = 20.dp, start = 20.dp)
            ){
                Text("P E A C E" , fontWeight = FontWeight.Bold)
                Text("Living life one day at a time")
                Text("Learning, growing, evolving every day")
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 17.dp),
                    Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically


            ){
                Button(
                    { /* code */ } ,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(4.dp)

                ) {
                    Text("Follow", fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedButton(
                    {/* code */},
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text("Message", fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedButton(
                    {/* code*/},
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text("Email", fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedButton(
                    {/* code */},
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.height(40.dp).width(30.dp),
                    contentPadding = PaddingValues(0.dp)

                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_keyboard_arrow_down_24),
                        null
                    )
                }
            }
            Row (
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Column( horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.bishwodip),
                        null,
                        modifier = Modifier.height(70.dp).width(70.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop


                    )
                    Text("Story 1")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Image(

                        painter = painterResource(R.drawable.car),

                        null,

                        modifier = Modifier.height(70.dp).width(70.dp).clip(CircleShape),

                        contentScale = ContentScale.Crop

                    )
                    Text("Story 2")
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Image(

                        painter = painterResource(R.drawable.ntorq),
                        null,
                        modifier = Modifier.height(70.dp).width(70.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 3")

                }
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.dog),
                        null,
                        modifier = Modifier.height(70.dp).width(70.dp).clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("Story 4")
                }




            }



        }

    }
}


@Preview
@Composable
fun Preview(){
    ProfileBody()
}