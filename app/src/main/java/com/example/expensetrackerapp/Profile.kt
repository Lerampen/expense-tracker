package com.example.expensetrackerapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.PrivacyTip
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
           Image(
               painter = painterResource(id = R.drawable.user_front_side_with_white_background) ,
               contentDescription = "profile picture",
               modifier = Modifier
                   .size(88.dp)
                   .clip(CircleShape)
               )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Stacy Apeyon", fontFamily = poppinsFontFamily, style = MaterialTheme.typography.headlineSmall)
                Text(text = "@apeyon", fontFamily = poppinsFontFamily, style = MaterialTheme.typography.bodySmall)


            }
        }


        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp) // Adjust the height as needed
                .clip(RoundedCornerShape(4.dp)), // Set the corner radius as desired
            color = Color.LightGray, // Set the divider color,
            content = {}
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,

        ){

            Icon(imageVector = Icons.Outlined.AccountBalanceWallet, contentDescription = "Wallet Icon")
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Account Details", fontFamily = poppinsFontFamily)

        }

       Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(8.dp)
           ,
           verticalAlignment = Alignment.CenterVertically,
       ) {
            Icon(
                imageVector = Icons.Outlined.PersonOutline,
                contentDescription = "Wallet Icon"
            )
            Spacer(
                modifier = Modifier.width(
                    4.dp
                )
            )
            Text(
                text = "Personal Details",
                fontFamily = poppinsFontFamily
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Outlined.Download,
                contentDescription = "Wallet Icon"
            )
            Spacer(
                modifier = Modifier.width(
                    4.dp
                )
            )
            Text(
                text = "Export Data",
                fontFamily = poppinsFontFamily
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Outlined.Settings,
                contentDescription = "Wallet Icon"
            )
            Spacer(
                modifier = Modifier.width(
                    4.dp
                )
            )
            Text(
                text = "Settings",
                fontFamily = poppinsFontFamily
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Outlined.Security,
                contentDescription = "Wallet Icon"
            )
            Spacer(
                modifier = Modifier.width(
                    4.dp
                )
            )
            Text(
                text = "Data and Privacy",
                fontFamily = poppinsFontFamily
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Outlined.Logout,
                contentDescription = "Wallet Icon"
            )
            Spacer(
                modifier = Modifier.width(
                    4.dp
                )
            )
            Text(
                text = "Logout",
                fontFamily = poppinsFontFamily
            )
        }
    }
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun ProfileScreenPreview() {
    ExpenseTrackerAppTheme {
        ProfileScreen()
    }
}