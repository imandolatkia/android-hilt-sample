package com.dolatkia.repository

import com.dolatkia.database.DBInterface
import com.dolatkia.modles.SampleModel
import com.dolatkia.network.NetWorkInterface

class Repository constructor(
    var network: NetWorkInterface,
    var database: DBInterface
) {
    fun getDataFromNetwork(): SampleModel {
        return network.getDataFromNetwork()
    }

    fun getDataFromDB(): SampleModel {
        return database.getDataFromDB()
    }
}