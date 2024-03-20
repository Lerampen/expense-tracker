package com.example.expensetrackerapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.NavigateBefore
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.NavigateBefore
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Tune
import androidx.compose.ui.graphics.vector.ImageVector

data class TopAppBarsItems(
    val navigationIcon : ImageVector = Icons.AutoMirrored.Outlined.NavigateBefore,
    val title : String = "",
    val action : ImageVector = Icons.Outlined.MoreVert,
    val route : String = ""
){
    fun topAppBarItems() : List<TopAppBarsItems>{
        return listOf(
            TopAppBarsItems(
                navigationIcon = Icons.Outlined.Menu,
                title = "Home",
                action =  Icons.Outlined.Notifications,
                route = Screens.Statistic.route
            ),
            TopAppBarsItems(
                navigationIcon = Icons.AutoMirrored.Outlined.NavigateBefore,
                title = "Statistics",
                action =  Icons.Outlined.Tune,
                route = Screens.Statistic.route
            ),
            TopAppBarsItems(
                navigationIcon = Icons.AutoMirrored.Outlined.NavigateBefore,
                title = "Add Expense",
                action =  Icons.Outlined.MoreVert,
                route = Screens.Statistic.route
            ),
            TopAppBarsItems(
                navigationIcon = Icons.AutoMirrored.Outlined.NavigateBefore,
                title = "Wallet",
                action =  Icons.Outlined.MoreVert,
                route = Screens.Statistic.route
            ),
            TopAppBarsItems(
                navigationIcon = Icons.AutoMirrored.Outlined.NavigateBefore,
                title = "Profile",
                action =  Icons.Outlined.Edit,
                route = Screens.Statistic.route
            ),
        )
    }
}
