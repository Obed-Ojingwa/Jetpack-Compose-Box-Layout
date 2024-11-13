package com.obedcodes.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.obedcodes.myjetpackcompose.ui.theme.MyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxExample2()
        }
    }
}

@Composable
fun BoxExample(){
    Box(modifier = Modifier
        .background(color = Color.Green)
        .size(180.dp, 300.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(125.dp, 100.dp)
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = "Hi",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .background(color = Color.White)
                    .size(90.dp, 50.dp)
                    .align(Alignment.BottomCenter)
            )
        }

    }
}

@Composable
fun BoxExample2() {

    Box (
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize()

    ){
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopStart),
            text = "TopStart"
        )

        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopCenter),
            text = "TopCenter"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopEnd),
            text = "TopEnd"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterStart),
            text = "CenterStart"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.Center),
            text = "Center"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterEnd),
            text = "CenterEnd"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomStart),
            text = "BottomStart"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomCenter),
            text = "BottomCenter"
        )
        Text(
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .background(color = Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomEnd),
            text = "BottomEnd"
        )
    }
}