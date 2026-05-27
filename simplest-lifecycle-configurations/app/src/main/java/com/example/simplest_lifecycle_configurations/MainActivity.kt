package com.example.simplest_lifecycle_configurations

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.platform.LocalContext
import com.example.simplest_lifecycle_configurations.ui.mainScreen.MainScreen
import com.example.simplest_lifecycle_configurations.ui.theme.SimplestlifecycleconfigurationsTheme

class MainActivity : ComponentActivity() {
    private val TAG = "MainActivity"

    // my laptop does not always log
    // even if more powerful than that of syntax
    fun _log(lifecycleMethod:String){
        repeat(5){
            Log.d(TAG, "$lifecycleMethod Called")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _log("onCreate")
        enableEdgeToEdge()
        setContent {
            SimplestlifecycleconfigurationsTheme {
                MainScreen()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        _log("onResume")
    }

    override fun onRestart() {
        super.onRestart()
        _log("onRestart")
    }

    override fun onPause() {
        super.onPause()
        _log("onPause")    }

    override fun onStop() {
        super.onStop()
        _log("onStop")    }

    override fun onDestroy() {
        super.onDestroy()
        _log("onDestroy")    }



}