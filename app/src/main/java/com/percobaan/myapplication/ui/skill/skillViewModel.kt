package com.percobaan.myapplication.ui.skill

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class skillViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is skill Fragment"
    }
    val text: LiveData<String> = _text
}