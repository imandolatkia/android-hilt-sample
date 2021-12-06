package com.dolatkia.androidhiltsample.data

import com.dolatkia.androidhiltsample.db.DBInterface
import com.dolatkia.androidhiltsample.network.NetWorkInterface

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