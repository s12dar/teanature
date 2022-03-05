package com.lyvetech.transnature.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Feed : Screen("feed")
}