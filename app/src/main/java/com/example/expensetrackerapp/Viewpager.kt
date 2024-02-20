package com.example.expensetrackerapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.compose.model.DotGraphic
import com.tbuonomo.viewpagerdotsindicator.compose.type.ShiftIndicatorType
import com.tbuonomo.viewpagerdotsindicator.compose.type.WormIndicatorType

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ViewPagerTest() {
    Column {
        var pageCount by remember { mutableIntStateOf(10) }
        val pagerState = rememberPagerState {
            10
        }
        HorizontalPager(
            modifier = Modifier.padding(top = 24.dp),

            contentPadding = PaddingValues(horizontal = 64.dp),
            pageSpacing = 24.dp,
            state = pagerState
        ) {page ->
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.Blue)
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(text = page.toString(), fontSize = 32.sp)
            }
        }
        DotsIndicator(
            dotCount = pageCount,
            type = WormIndicatorType(dotsGraphic = DotGraphic(
                size = 16.dp,
                color = Color.Transparent,
                borderColor = colorResource(id = R.color.lord_icon_green),
                borderWidth = 2.dp
                ),
                wormDotGraphic = DotGraphic(color = Color.Gray)
            ),
            pagerState = pagerState
        )
    }
}