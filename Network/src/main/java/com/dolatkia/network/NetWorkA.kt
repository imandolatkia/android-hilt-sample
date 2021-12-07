package com.dolatkia.network

import com.dolatkia.modles.SampleModel

class NetWorkA : NetWorkInterface {
    override fun getDataFromNetwork(): SampleModel {
        return SampleModel("data from Network A")
    }
}