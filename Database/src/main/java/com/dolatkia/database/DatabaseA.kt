package com.dolatkia.database

import com.dolatkia.modles.SampleModel

class DatabaseA : DBInterface {
    override fun getDataFromDB(): SampleModel {
        return SampleModel("data from DB A")
    }
}