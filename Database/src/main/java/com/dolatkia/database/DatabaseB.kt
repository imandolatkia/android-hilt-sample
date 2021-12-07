package com.dolatkia.database

import com.dolatkia.modles.SampleModel

class DatabaseB : DBInterface {
    override fun getDataFromDB(): SampleModel {
        return SampleModel("data from DB B")
    }
}