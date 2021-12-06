package com.dolatkia.androidhiltsample.network

import com.dolatkia.androidhiltsample.data.SampleModel

interface NetWorkInterface {
    fun getDataFromNetwork(): SampleModel
}