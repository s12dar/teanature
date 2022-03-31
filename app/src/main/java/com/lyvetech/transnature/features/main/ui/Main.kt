package com.lyvetech.transnature.features.main.ui

import androidx.annotation.StringRes
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.insets.navigationBarsPadding
import com.lyvetech.transnature.R
import com.lyvetech.transnature.features.feed.ui.FeedScreen
import com.lyvetech.transnature.features.feed.ui.FeedViewModel

@Composable
fun Main(
    feedViewModel: FeedViewModel = hiltViewModel()
) {
    val (selectedTab, setSelectedTab) = remember { mutableStateOf(TeanatureHomeTab.Feed) }
    val tabs = TeanatureHomeTab.values()
    Scaffold(
        backgroundColor = MaterialTheme.colors.primarySurface,
        bottomBar = {
            BottomNavigation {
                tabs.forEach { tab ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = tab.icon,
                                contentDescription = null
                            )
                        },
                        label = { Text(text = stringResource(id = tab.title)) },
                        selected = tab == selectedTab,
                        onClick = { setSelectedTab(tab) },
                        alwaysShowLabel = false,
                        selectedContentColor = MaterialTheme.colors.secondary,
                        unselectedContentColor = LocalContentColor.current,
                        modifier = Modifier.navigationBarsPadding()
                    )
                }
            }
        }
    ) {
        when (selectedTab) {
            TeanatureHomeTab.Feed -> FeedScreen(feedViewModel)
//            TeanatureHomeTab.Statistics -> StatisticsScreen(statisticsViewModel)
//            TeanatureHomeTab.Profile -> ProfileScreen(profileViewModel)
        }
    }
}


enum class TeanatureHomeTab(
    @StringRes val title: Int,
    val icon: ImageVector
) {
    Feed(R.string.menu_feed, Icons.Filled.Home),
//    Statistics(R.string.menu_statistics, Icons.Filled.Call),
//    Profile(R.string.menu_profile, Icons.Filled.Call)
}