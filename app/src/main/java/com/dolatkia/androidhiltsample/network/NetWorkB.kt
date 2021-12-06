package com.dolatkia.androidhiltsample.network

import com.dolatkia.androidhiltsample.data.SampleModel

class NetWorkB : NetWorkInterface {
    override fun getDataFromNetwork(): SampleModel {
        return SampleModel("data from Network B")
    }
}