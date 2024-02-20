package com.example.expensetrackerapp

sealed class Screens(val route: String) {

     data object OnBoardingScreen : Screens("onboarding_screen")
     data object HomeScreen : Screens("home_screen")
}