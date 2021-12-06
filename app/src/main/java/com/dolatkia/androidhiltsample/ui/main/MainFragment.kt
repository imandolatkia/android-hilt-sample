package com.dolatkia.androidhiltsample.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dolatkia.androidhiltsample.R
import com.dolatkia.androidhiltsample.data.Repository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import androidx.fragment.app.viewModels


@AndroidEntryPoint
class MainFragment : Fragment(R.layout.main_fragment) {

    @Inject
    lateinit var repository: Repository

    private val viewModel: MainViewModel by viewModels()

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getDataFromNetwork()

        Log.d("dolatkia-log", "fragment" + repository.getDataFromNetwork().data)
        Log.d("dolatkia-log", "fragment" + repository.getDataFromDB().data)
    }

    override fun onResume() {
        super.onResume()
        activity?.startActivity(Intent(context, SecondActivity::class.java))
    }
}