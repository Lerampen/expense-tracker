package com.example.expensetrackerapp

import android.media.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily

@Composable
fun OnBoardingPage(image: String, title: String, description: String) {
    Column(

    ) {
        AsyncImage( model = image, contentDescription = null, modifier = Modifier.fillMaxWidth() )
        Text(
            text = title,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.lord_icon_green),
            modifier = Modifier.padding(8.dp).padding(horizontal = 32.dp)
        )
        Text(
            text = description,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp)
                .padding(horizontal = 32.dp)
        )
        

    }
}