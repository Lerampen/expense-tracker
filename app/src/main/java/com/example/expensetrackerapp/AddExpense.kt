package com.example.expensetrackerapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.Category
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme
import androidx.compose.ui.unit.dp
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily


@Composable
fun AddExpense() {

    var amount by remember {
        mutableStateOf("")
    }
    var category by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {


        //TextField for Amount
        OutlinedTextField(
            value = amount,
            onValueChange = {newText -> amount = newText},
            leadingIcon = {Icon(imageVector = Icons.Outlined.AttachMoney, contentDescription = "Money Icon")},
            placeholder = { Text(text = "Amount", fontFamily = poppinsFontFamily)},
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.green_hue),
                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            ),

            )

        Spacer(modifier = Modifier.height(8.dp))
//        TextField for Category
        OutlinedTextField(
            value = category,
            onValueChange = {newText -> category = newText},
            leadingIcon = {Icon(imageVector = Icons.Outlined.Category, contentDescription = null)},
            placeholder = { Text(text = "Category", fontFamily = poppinsFontFamily)},
            trailingIcon = { Icon(imageVector = Icons.Outlined.ArrowDropDown, contentDescription = "Drop-down arrow icon") },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.green_hue),
                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))

//        TextField for Description
        OutlinedTextField(
            value = category,
            onValueChange = {newText -> category = newText},
            leadingIcon = {Icon(imageVector = Icons.Outlined.Edit, contentDescription = "Edit Icon")},
            placeholder = { Text(text = "Description", fontFamily = poppinsFontFamily)},

            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.green_hue),
                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))

        //        TextField for Wallet
        OutlinedTextField(
            value = category,
            onValueChange = {newText -> category = newText},
            leadingIcon = { Icon(Icons.Outlined.AccountBalanceWallet, contentDescription = "wallet Icon") },
            placeholder = { Text(text = "Wallet", fontFamily = poppinsFontFamily)},
            trailingIcon = {Icon(imageVector = Icons.Outlined.ArrowDropDown, contentDescription = "Drop-down Arrow Icon")},
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.green_hue),
                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(width = 1.dp, color = colorResource(id = R.color.lord_icon_green))

            ) {
            Icon(
                imageVector = Icons.Outlined.Description,
                contentDescription = "take picture of receipt",
                tint = colorResource(id = R.color.green_hue)
                )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Add Receipt", fontFamily = poppinsFontFamily, color = Color.Black)
        }

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
            Text(text = "Add Expense", fontFamily = poppinsFontFamily)
        }


    }
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun AddExpensePreview() {
    ExpenseTrackerAppTheme {
        AddExpense()
    }
}