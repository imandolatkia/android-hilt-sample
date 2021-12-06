package com.dolatkia.androidhiltsample.ui.main

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.dolatkia.androidhiltsample.data.Repository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CustomView : View {

    @Inject lateinit var repository: Repository

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        Log.d("dolatkia-log", "CustomView " + repository.getDataFromNetwork().data)
        Log.d("dolatkia-log", "CustomView " + repository.getDataFromDB().data)
    }
}