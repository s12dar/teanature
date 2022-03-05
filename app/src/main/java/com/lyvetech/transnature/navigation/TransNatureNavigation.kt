package com.lyvetech.transnature.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lyvetech.transnature.features.feed.ui.FeedScreen
import com.lyvetech.transnature.features.splash.ui.SplashScreen

@Composable
fun TransNatureNavigation() {

    val navigation = rememberNavController()
    NavHost(
        navController = navigation,
        startDestination = Screen.Splash.route
    ) {
        composable(
            route = Screen.Splash.route
        ) {
            SplashScreen(
                navigationController = navigation
            )
        }

        composable(
            route = Screen.Feed.route
        ) {
            FeedScreen()
        }
    }
}
