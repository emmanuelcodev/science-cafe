package com.example.sciencecafe

import android.util.Log
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }



    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}