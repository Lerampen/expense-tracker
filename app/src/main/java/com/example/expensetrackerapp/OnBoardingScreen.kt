package com.example.expensetrackerapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily

@Composable
fun OnBoardingScreen() {

    Box(modifier = Modifier.fillMaxSize()){

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly


        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = stringResource(R.string.welcome),
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 40.sp
                )
            }

            Column (
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            ){
//                Image(painter = painterResource(id = R.drawable.sandy_bus_37_single_04) , contentDescription = "welcome image" )
                AsyncImage(
                    model = "https://img.freepik.com/free-vector/transactional-marketing-abstract-illustration_335657-5035.jpg",
                    contentDescription = "image depicting budgeting" )

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.green_hue) ,
                        contentColor = Color.White)
                
                ) {
                    Text(text = stringResource(R.string.go_to_sign_in) )
                }

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(4.dp),
                    border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.green_hue)
                    )

                    ) {
                    Text(
                        text = "No account yet? Sign up",
                        color = colorResource(id = R.color.green_hue)
                        )
                }
            }
        }
    }

}

@Preview(showBackground = true, device = Devices.PIXEL, apiLevel = 33)
@Composable
fun OnBoardingPreview() {
    ExpenseTrackerAppTheme{
        OnBoardingScreen()
    }
}