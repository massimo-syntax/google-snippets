package com.example.simplest_lifecycle_configurations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.simplest_lifecycle_configurations.ui.mainScreen.MainScreen
import com.example.simplest_lifecycle_configurations.ui.theme.SimplestlifecycleconfigurationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimplestlifecycleconfigurationsTheme {
                MainScreen()
            }
        }
    }
}