package com.lyvetech.transnature.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TransNatureNavigation() {

    val navigation = rememberNavController()
    NavHost(
        navController = navigation,
        startDestination = Screen.Feed.route
    ) {
//        composable(
//            route = Screen.Splash.route
//        ) {
//            SplashScreen(
//                navigationController = navigation
//            )
//        }

        composable(
            route = Screen.Feed.route
        ) {
            Main(hiltViewModel())
        }
    }
}
