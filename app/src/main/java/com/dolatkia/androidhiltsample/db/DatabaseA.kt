package com.dolatkia.androidhiltsample.db

import com.dolatkia.androidhiltsample.data.SampleModel
import javax.inject.Inject

class DatabaseA : DBInterface {

    override fun getDataFromDB(): SampleModel {
        return SampleModel("data from DB A")
    }
}