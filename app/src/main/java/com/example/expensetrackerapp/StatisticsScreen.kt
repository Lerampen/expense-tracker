package com.example.expensetrackerapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.expensetrackerapp.ui.theme.ExpenseTrackerAppTheme

val lightGreen = Color(0xff08a88a)
val darkGreen = Color(0xff004643)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StatisticsScreen() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                listOf(
                    lightGreen,
                    darkGreen
                )
            )
        )){
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f),
                contentAlignment = Alignment.Center
                ) {


            }
            Column (modifier = Modifier
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp
                    )
                )
                .background(color = colorResource(id = R.color.mojito_breeze)),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

      val tabItems = listOf("Transactions","Upcoming Bills")
                val pagerState = rememberPagerState {
                    0
                }
                TabRow(
                    selectedTabIndex = pagerState.currentPage,
                    containerColor = colorResource(id = R.color.white),
                    modifier = Modifier
                        .padding(20.dp)
                        .background(color = Color.Transparent)
                        .clip(RoundedCornerShape(32.dp)),




                ) {
                    tabItems.forEachIndexed{index, title ->
                        Tab(selected = pagerState.currentPage == index,
                            onClick = { /*TODO*/ },
                           modifier = Modifier.background(color =  colorResource(id = R.color.mojito_breeze), shape = RoundedCornerShape(32.dp)),
                            text= {
                                Text(
                                    text = title,
                                    style = if (pagerState.currentPage == index)
                                        TextStyle(
                                            color = Color.Black,
                                            fontSize = 18.sp
                                        )
                                    else
                                        TextStyle(color = colorResource(id = R.color.light_yellow), fontSize = 16.sp),
                                )
                            }
                            
                        )
                    }
                }
            }

        }
    }
    
}

@Preview(showBackground = true, apiLevel = 33)
@Composable
fun StatisticPreview() {

    ExpenseTrackerAppTheme {
        StatisticsScreen()
    }
}