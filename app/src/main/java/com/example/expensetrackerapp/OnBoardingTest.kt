package com.example.expensetrackerapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily
import com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.compose.model.DotGraphic
import com.tbuonomo.viewpagerdotsindicator.compose.type.WormIndicatorType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingTest() {
    Column(modifier = Modifier) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly


        ) {

            val pagerState = rememberPagerState {
                4
            }
            HorizontalPager(
                modifier = Modifier.padding(top = 8.dp),
                pageSpacing = 24.dp,
                state = pagerState
            ) { page ->
                when (page){
                    0 -> OnBoardingPage(
                        image = "https://img.freepik.com/free-vector/qr-code-concept-illustration_114360-5583.jpg",
                        title = "Scan Receipts",
                        description = "Effortlessly scan and store your receipts for easy expense tracking."
                    )
                    1 -> OnBoardingPage(
                        image = "https://img.freepik.com/free-vector/financial-planning-concept-illustration_114360-16976.jpg",
                        title = "Expense Tracking",
                        description = "Keep track of your expenses and categorize them to manage your budget."
                    )
                    2 -> OnBoardingPage(
                        image = "https://img.freepik.com/free-vector/analytics-concept-illustration_114360-137.jpg",
                        title = "Budget Insights",
                        description = "Gain insights into your spending patterns with visualizations and reports."
                    )
                    3 -> OnBoardingPage(
                        image = "https://img.freepik.com/free-vector/hands-holding-tablet-with-forefinger-clicking-start-button-new-application-launch-flat-illustration_74855-20595.jpg",
                        title = "Get Started",
                        description = "Start tracking your expenses and managing your budget today!"
                    )
                }
            }
            var pageCount by remember { mutableIntStateOf(4) }

            DotsIndicator(
                dotCount = pageCount,
                type = WormIndicatorType(dotsGraphic = DotGraphic(
                    size = 16.dp,
                    color = Color.Transparent,
                    borderColor = colorResource(id = R.color.lord_icon_green),
                    borderWidth = 2.dp
                ),
                    wormDotGraphic = DotGraphic(color = colorResource(id = R.color.lord_icon_green))
                ),
                pagerState = pagerState
            )

            if (pagerState.currentPage == pageCount - 1) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(5.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.lord_icon_green),
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(4.dp)


                    ) {
                        Text(text = stringResource(R.string.go_to_sign_in))
                    }
                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(4.dp),
                        border = BorderStroke(
                            width = 1.dp,
                            color = colorResource(id = R.color.lord_icon_green)
                        ),
                        shape = RoundedCornerShape(4.dp)

                    ) {
                        Text(
                            text = "No account yet? Sign up",
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.lord_icon_green)
                        )
                    }
                }
            }

        }
    }
}