package com.lyvetech.transnature.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Feed : BottomBarScreen(
        route = "feed",
        title = "Home",
        icon = Icons.Default.Home
    )

    object History : BottomBarScreen(
        route = "history",
        title = "History",
        icon = Icons.Default.Home
    )

    object Statistics : BottomBarScreen(
        route = "statistics",
        title = "Statistics",
        icon = Icons.Default.Info
    )
}