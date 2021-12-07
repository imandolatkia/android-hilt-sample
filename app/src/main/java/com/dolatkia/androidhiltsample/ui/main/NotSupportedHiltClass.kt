package com.dolatkia.androidhiltsample.ui.main

import android.content.Context
import android.util.Log
import com.dolatkia.repository.Repository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent

class NotSupportedHiltClass constructor(var context: Context) {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface NotSupportedHiltClassHilt {
        fun getRepository(): Repository
    }

    fun getData(){
        val hiltEntryPoint  = EntryPointAccessors.fromApplication(context, NotSupportedHiltClassHilt::class.java)
        Log.d("dolatkia-log", "NotSupportedHiltClass " + hiltEntryPoint.getRepository().getDataFromNetwork().data)
        Log.d("dolatkia-log", "NotSupportedHiltClass " + hiltEntryPoint.getRepository().getDataFromDB().data)
    }
}