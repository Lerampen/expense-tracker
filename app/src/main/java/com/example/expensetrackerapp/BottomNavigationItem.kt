package com.example.expensetrackerapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItems(
    val label : String = "",
    val icon : ImageVector = Icons.Outlined.Home,
    val route : String = ""
){
    fun bottomNavigationItems() : List<BottomNavigationItems>{
        return listOf(
            BottomNavigationItems(
                label = "Home",
                icon = Icons.Outlined.Home,
                route = Screens.Home.route
            ),
            BottomNavigationItems(
                label = "Statistics",
                icon = Icons.Outlined.BarChart,
                route = Screens.Statistic.route
            ),
            BottomNavigationItems(
                label = "Expense",
                icon = Icons.Outlined.AddCircleOutline,
                route = Screens.AddExpense.route
            ),
            BottomNavigationItems(
                label = "Wallet",
                icon = Icons.Outlined.Wallet,
                route = Screens.Wallet.route
            ),
            BottomNavigationItems(
                label = "Profile",
                icon = Icons.Outlined.PersonOutline,
                route = Screens.Profile.route
            )

        )
    }
}
