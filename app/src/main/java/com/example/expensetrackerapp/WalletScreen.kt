package com.example.expensetrackerapp

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily
import java.nio.file.WatchEvent

@Composable
fun WalletScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            color = colorResource(id = R.color.green_hue)
        )) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.10f),

            )

         Column(modifier = Modifier
             .fillMaxSize()
             .clip(
                 RoundedCornerShape(
                     topStart = 32.dp,
                     topEnd = 32.dp
                 )
             )
             .background(color = Color.White),
             horizontalAlignment = Alignment.CenterHorizontally)   {
             Spacer(modifier = Modifier.height(16.dp))
                BalanceComp()
                Spacer(modifier = Modifier.height(16.dp))
             TransactPreview()

                Row(
                    modifier = Modifier.padding(4.dp)
                ) {

                    Spacer(modifier = Modifier.width(16.dp))


                }
            }

        }


    }
}


@Preview(showBackground = true, apiLevel = 33)
@Composable
fun WalletPreview() {
    ExpenseTrackerAppTheme {
        WalletScreen()
    }
}

@Composable
fun BalanceComp() {
    Column(modifier = Modifier.padding(top = 8.dp)) {
        Text(
            text = "Total Balance",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )
        Text(
            text = "$12,385.00",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 40.sp
        )
    }
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun BalanceCompPreview() {
    ExpenseTrackerAppTheme {
        BalanceComp()
    }
}

@Composable
fun TransactionsComp() {
    Row(modifier = Modifier.padding(horizontal = 8.dp)) {
        Column() {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(80.dp),
                shape = MaterialTheme.shapes.medium,
                border = BorderStroke(
                    width = 1.dp, color = colorResource(
                        id = R.color.green_hue
                    )
                )
            ) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "Add",
                    tint = colorResource(
                        id = R.color.green_hue
                    )
                )
            }
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Add",
                modifier = Modifier.padding(horizontal = 12.dp),
                fontFamily = poppinsFontFamily,
                textAlign = TextAlign.Center
            )

        }
        Spacer(modifier = Modifier.width(12.dp))

        Column {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(80.dp),
                shape = MaterialTheme.shapes.medium,
                border = BorderStroke(
                    width = 1.dp, color = colorResource(
                        id = R.color.green_hue
                    )
                )
                ) {
                Icon(
                    imageVector = Icons.Outlined.QrCodeScanner,
                    contentDescription = "Scan",
                    tint = colorResource(
                        id = R.color.green_hue
                    )
                )
            }
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Scan",
                fontFamily = poppinsFontFamily,
                modifier = Modifier.padding(horizontal = 12.dp)
            )

        }
        Spacer(modifier = Modifier.width(12.dp))

        Column {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(80.dp),
                shape = MaterialTheme.shapes.medium,
                border = BorderStroke(
                    width = 1.dp, color = colorResource(
                        id = R.color.green_hue
                    )
                )

                ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.Send,
                    contentDescription = "Send",
                    tint = colorResource(
                        id = R.color.green_hue
                    )
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(
                text = "Send",
                fontFamily = poppinsFontFamily,
                modifier = Modifier.padding(horizontal = 12.dp)
            )
        }
    }

}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun TransactPreview() {
    ExpenseTrackerAppTheme {
        TransactionsComp()
    }
}
@Composable
fun CardComp() {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.mojito_breeze)
        ),
        modifier = Modifier.padding(12.dp)
    ) {
        Row (modifier = Modifier.padding(20.dp)){

            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(
                   color =  colorResource(id = R.color.candy_floss ),
                    shape = RoundedCornerShape(12.dp)
                )
                ) {
                Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "Shopping" )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {

              Row  {
                    Text(
                        text = "Shopping",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                  Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "-$700",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Red
                    )
                }


             Row {
                  Text(text = "Puma Store", fontFamily = poppinsFontFamily, fontSize = 12.sp)
                 Spacer(modifier = Modifier.weight(1f))
                  Text(text = "Cash", fontFamily = poppinsFontFamily, fontSize = 12.sp, color = Color.LightGray)
              }

            }
        }
    }
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun CardCompPreview() {
    ExpenseTrackerAppTheme {
        CardComp()
    }
}