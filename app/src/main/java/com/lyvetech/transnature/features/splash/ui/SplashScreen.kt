package com.lyvetech.transnature.features.splash.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.lyvetech.transnature.R
import com.lyvetech.transnature.navigation.Screen

@Composable
fun SplashScreen(
    navigationController: NavController? = null
) {
    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.background),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_app),
                contentDescription = null
            )

            navigationController?.popBackStack()
            navigationController?.navigate(Screen.Feed.route)
        }
    }
}