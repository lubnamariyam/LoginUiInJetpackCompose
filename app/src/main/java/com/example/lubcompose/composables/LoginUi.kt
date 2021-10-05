package com.example.lubcompose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.lubcompose.R


@ExperimentalComposeApi
@Composable
fun Loginui() {

    val Logimage = painterResource(id = R.drawable.loginimage)
    var emailvalue by remember { mutableStateOf("") }
    var passwordvalue by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {

            Image(painter = Logimage, contentDescription = "login")

        }

        Spacer(modifier = Modifier.padding(10.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.60f)

                .clip(
                    RoundedCornerShape(
                        bottomEnd = 30.dp,
                        bottomStart = 30.dp,
                        topEnd = 30.dp,
                        topStart = 30.dp,
                    ),
                )
                .background(
                    Color.White,
                )
                .padding(10.dp)
        ) {
            Text(
                text = "Sign In",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = TextUnit(30f, TextUnitType.Sp)
                )
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            OutlinedTextField(
                value = emailvalue,
                onValueChange = { emailvalue = it },
                label = {
                    Text(
                        text = "Email Address"
                    )
                },
                placeholder = { Text(text = "Email") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f),
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(
                value = passwordvalue,
                onValueChange = { passwordvalue = it },
                placeholder = { Text(text = "Password") },
                label = {
                    Text(
                        text = "Password"
                    )
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(0.8f),
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { }, modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
            ) {
                Text(text = "LOGIN", fontSize = TextUnit(20f, TextUnitType.Sp))

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "Create an Account")

            Spacer(modifier = Modifier.padding(20.dp))

        }

    }
}


