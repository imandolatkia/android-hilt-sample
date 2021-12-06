package com.dolatkia.androidhiltsample.db

import com.dolatkia.androidhiltsample.data.SampleModel

class DatabaseB : DBInterface {
    override fun getDataFromDB(): SampleModel {
        return SampleModel("data from DB B")
    }
}