package com.example.expensetrackerapp

sealed class Screens(val route: String) {

     data object OnBoarding : Screens("onboarding_screen")
     data object Home : Screens("home_screen")
     data object Statistic: Screens("statistics_screen")
     data object  AddExpense: Screens("add_expense_screen")
     data object Wallet: Screens("wallet_screen")
     data object Profile: Screens("profile_screen")
}