package com.dolatkia.androidhiltsample.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dolatkia.androidhiltsample.R
import com.dolatkia.androidhiltsample.data.Repository
import com.dolatkia.androidhiltsample.data.SampleModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        Log.d("dolatkia-log", "SecondActivity " + repository.getDataFromNetwork().data)
        Log.d("dolatkia-log", "SecondActivity " + repository.getDataFromDB().data)

        NotSupportedHiltClass(applicationContext).getData()
    }
}