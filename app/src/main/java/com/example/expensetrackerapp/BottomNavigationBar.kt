package com.example.expensetrackerapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.expensetrackerapp.ui.theme.poppinsFontFamily

@Composable
fun BottomNavigationBar() {
    var navigationSelectedItem by remember {
        mutableIntStateOf(0)
    }
    val navController = rememberNavController()
    val topAppBarsItems = TopAppBarsItems().topAppBarItems()

    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBarContent(topAppBarsItems = topAppBarsItems[navigationSelectedItem]) },
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

                StatisticsScreen()
            }
            composable(Screens.AddExpense.route){

                AddExpense()
            }
            composable(Screens.Wallet.route){

                WalletScreen()
            }
            composable(Screens.Profile.route){
                ProfileScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarContent(topAppBarsItems: TopAppBarsItems) {
    TopAppBar(
        title = {
           Row (modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.Center
               ) {
                Text(
                    text = topAppBarsItems.title,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.lord_icon_green)
                )
            }
                },
        navigationIcon = {
            Icon(
                imageVector = topAppBarsItems.navigationIcon,
                contentDescription = topAppBarsItems.title,
                modifier = Modifier.clickable {  } )
        },
        actions = {
            Icon(imageVector = topAppBarsItems.action,
                contentDescription = topAppBarsItems.title,
                modifier = Modifier.clickable {  }
                )
        },
        colors = TopAppBarDefaults.topAppBarColors(
        navigationIconContentColor = colorResource(id = R.color.lord_icon_green),
        actionIconContentColor = colorResource(id = R.color.lord_icon_green)
    )
    )
}