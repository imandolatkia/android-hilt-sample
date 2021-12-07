package com.dolatkia.network

import com.dolatkia.modles.SampleModel

interface NetWorkInterface {
    fun getDataFromNetwork(): SampleModel
}