package com.dolatkia.network

import com.dolatkia.modles.SampleModel

class NetWorkB : NetWorkInterface {
    override fun getDataFromNetwork(): SampleModel {
        return SampleModel("data from Network B")
    }
}