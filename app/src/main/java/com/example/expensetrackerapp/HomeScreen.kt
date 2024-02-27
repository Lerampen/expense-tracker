package com.example.expensetrackerapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDownward
import androidx.compose.material.icons.outlined.ArrowUpward
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        CustomTopAppBar()
        Spacer(modifier = Modifier.height(16.dp))
        CardComposable()
        Spacer(modifier = Modifier.height(16.dp))
        TransactionsComposable()
    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ExpenseTrackerAppTheme {
        HomeScreen()
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {
    TopAppBar(
        title = { /*TODO*/ },
        modifier = Modifier,
        navigationIcon = {
            Icon(imageVector = Icons.Outlined.Menu, contentDescription = "Menu")
        },
        actions = {
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "Notifications")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            navigationIconContentColor = colorResource(id = R.color.lord_icon_green),
            actionIconContentColor = colorResource(id = R.color.lord_icon_green)
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    ExpenseTrackerAppTheme {
        CustomTopAppBar()
    }
}


@Preview
@Composable
fun TopAppBarDarkPreview() {
    ExpenseTrackerAppTheme(darkTheme = true) {
        CustomTopAppBar()
    }
}

@Composable
fun CardComposable() {

    Card( elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.green_hue),
            contentColor = Color.White
        )
    ) {

        Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(16.dp)) {
            Text(text = "Total Balance", fontFamily = poppinsFontFamily, fontSize = 12.sp, fontWeight = FontWeight.Normal)

           Row {
               Text(text = "$ 4,567.00", fontFamily = poppinsFontFamily, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
               Spacer(modifier = Modifier.width(2.dp))
               Icon(imageVector = Icons.Outlined.Visibility, contentDescription = "visibility icon")

           }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Icon(imageVector = Icons.Outlined.ArrowDownward, contentDescription = "Downward Arrow",  modifier = Modifier.size(12.dp))
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "Income", modifier = Modifier, fontFamily = poppinsFontFamily, fontSize = 12.sp, fontWeight = FontWeight.Normal)
                Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Outlined.ArrowUpward,
                        contentDescription = "Upward Arrow",
                        modifier = Modifier.size(12.dp)
                    )
                Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Expense",
                        fontFamily = poppinsFontFamily,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )

            }
          Row  {
                Text(text = "$ 1,234.00", fontFamily = poppinsFontFamily, fontSize = 12.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "$ 234.00", fontFamily = poppinsFontFamily, fontSize = 12.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    ExpenseTrackerAppTheme {
        CardComposable()
    }
}

@Composable
fun TransactionsComposable() {
    Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(16.dp)){
        Row {
            Text(text = "Transactions", fontFamily = poppinsFontFamily, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "View All", fontFamily = poppinsFontFamily, fontSize = 8.sp, modifier = Modifier.paddingFromBaseline(top = 16.dp ) )
        }
        Row {
            Text(
                text = "Today .",
                fontFamily = poppinsFontFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "February 26",
                fontFamily = poppinsFontFamily,
                fontSize = 8.sp,
                modifier = Modifier.paddingFromBaseline(top = 14.dp, ),
                color = Color.LightGray
            )
        }
        Card(elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black) ){
            Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(16.dp)) {
                Row {
                    Icon(imageVector = Icons.Outlined.ShoppingCart , modifier = Modifier.clip(RoundedCornerShape(8.dp)), contentDescription = "Shopping Cart Icon",)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "Shopping", fontFamily = poppinsFontFamily, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "-$590", fontFamily = poppinsFontFamily, fontSize = 8.sp, color = Color.Red, modifier = Modifier.paddingFromBaseline(top = 16.dp ) )



                }
                Row {
                    Spacer(modifier = Modifier.width(28.dp))
                    Text(text = "Puma Store", fontFamily = poppinsFontFamily, fontSize = 8.sp, modifier = Modifier.paddingFromBaseline(top = 12.dp ))
                    Spacer(modifier = Modifier.weight(1f))
                    Text(text = "Cash", fontFamily = poppinsFontFamily, fontSize = 8.sp, color = Color.LightGray, modifier = Modifier.paddingFromBaseline(top = 12.dp ) )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransactionPreview() {
    ExpenseTrackerAppTheme {
TransactionsComposable()
    }
}