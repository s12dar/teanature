package com.lyvetech.transnature.features

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lyvetech.transnature.navigation.TransNatureNavigation
import com.lyvetech.transnature.ui.theme.TransnatureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TransnatureTheme {
                TransNatureNavigation()
            }
        }
    }
}