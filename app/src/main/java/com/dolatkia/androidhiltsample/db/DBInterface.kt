package com.dolatkia.androidhiltsample.db

import com.dolatkia.androidhiltsample.data.SampleModel

interface DBInterface {
    fun getDataFromDB(): SampleModel
}