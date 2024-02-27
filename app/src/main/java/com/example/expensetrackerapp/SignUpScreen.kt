package com.example.expensetrackerapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily





@Composable
fun SignUpScreen() {
    var name by remember {
        mutableStateOf("")
    }
    // TODO: Test if this modular code works
    val outlinedTextFieldColors = TextFieldDefaults.colors(
        unfocusedContainerColor = Color.White,
        focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
        unfocusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
        cursorColor = colorResource(id = R.color.lord_icon_green),
        focusedLabelColor = colorResource(id = R.color.lord_icon_green),

//    errorColor = MyTheme.colors.error,
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
        ){
        IconButton(
            onClick = { /*TODO*/ },
            ) {
           Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back button")

        }
        Text(
            text = "Create new account",
            modifier = Modifier.width(250.dp),
            fontSize = 40.sp,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.SemiBold

        )


        OutlinedTextField(
            value = name,
            onValueChange ={newText ->
            name = newText},
            label = { Text(text = "Full name",fontFamily = poppinsFontFamily) },
            placeholder = {
                Text(text = "Enter your name",fontFamily = poppinsFontFamily)
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            )

        )



        var email by remember {
            mutableStateOf("")
        }

        OutlinedTextField(
            value = email,
            onValueChange ={newText ->
                email = newText},
            label = { Text(text = "Email Address", fontFamily = poppinsFontFamily) },
            placeholder = {
                Text(text = "email@example.com",fontFamily = poppinsFontFamily)
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
            ),
            keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Email)

        )

        var passwd by remember {
            mutableStateOf("")
        }
        var  passwordVisible by remember {
            mutableStateOf(false)
        }

        OutlinedTextField(
            value = passwd,
            onValueChange = {newText -> passwd = newText},
            label = { Text(text = "Create Password", fontFamily = poppinsFontFamily)},
            placeholder = { Text(text = "Enter your password", fontFamily = poppinsFontFamily)},
            colors = TextFieldDefaults.colors(

                focusedLabelColor = colorResource(id = R.color.lord_icon_green),
                cursorColor = colorResource(id = R.color.lord_icon_green),
                focusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedIndicatorColor = colorResource(id = R.color.lord_icon_green),
                unfocusedContainerColor = Color.White,

            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    
                }
                Icon(imageVector = image , contentDescription = "" )
            },
            )

    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.lord_icon_green),
            contentColor = Color.White
        ),


    ) {

        Text(
            text = "Sign Up",
            fontFamily = poppinsFontFamily
            )
    }
    }
}

