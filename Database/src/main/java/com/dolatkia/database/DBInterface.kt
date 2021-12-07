package com.dolatkia.database

import com.dolatkia.modles.SampleModel

interface DBInterface {
    fun getDataFromDB(): SampleModel
}