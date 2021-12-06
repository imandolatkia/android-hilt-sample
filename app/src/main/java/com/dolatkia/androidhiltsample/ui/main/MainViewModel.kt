package com.dolatkia.androidhiltsample.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dolatkia.androidhiltsample.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    @Inject
    lateinit var repository: Repository

    fun getDataFromNetwork() {
        Log.d("dolatkia-log", "MainViewModel " + repository.getDataFromNetwork().data)
        Log.d("dolatkia-log", "MainViewModel " + repository.getDataFromDB().data)
    }
}