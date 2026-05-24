package com.example.simplest_lifecycle_configurations.ui.mainScreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainScreenViewModel : ViewModel() {

    private val _number = MutableStateFlow(0)
    val number: StateFlow<Int> = _number.asStateFlow()

    fun updateNumber() {
        _number.update { it + 1 }
    }
}
