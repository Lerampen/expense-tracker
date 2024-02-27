package com.example.expensetrackerapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun BottomNavigationBar() {
    var navigationSelectedItem by remember {
        mutableIntStateOf(0)
    }
    val navController = rememberNavController()

    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                BottomNavigationItems().bottomNavigationItems().forEachIndexed{
                    index, navigationItems ->
                    NavigationBarItem(
                        selected = index == navigationSelectedItem,
                        label = {
                                Text(text = navigationItems.label)
                        },
                        onClick = {
                                  navigationSelectedItem = index
                            navController.navigate(navigationItems.route){
                                popUpTo(navController.graph.findStartDestination().id){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                                  },
                        icon = {
                           Icon (navigationItems.icon,
                            contentDescription = navigationItems.label,
                               tint = colorResource(id = R.color.lord_icon_green)
                           )
                        })
                }
            }
        },

        ){paddingValues ->  

        NavHost(
            navController = navController,
            startDestination = Screens.Home.route,
            modifier = Modifier.padding(paddingValues) ){
            composable(Screens.Home.route){

                HomeScreen()
            }
            composable(Screens.Statistic.route){

            }
            composable(Screens.AddExpense.route){

            }
            composable(Screens.Wallet.route){

            }
            composable(Screens.Profile.route){

            }
        }
    }
}

