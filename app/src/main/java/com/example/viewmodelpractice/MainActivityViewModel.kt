package com.example.viewmodelpractice

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var num = 0
    fun add(){
        num++
    }
}