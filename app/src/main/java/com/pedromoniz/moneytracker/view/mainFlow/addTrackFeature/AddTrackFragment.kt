package com.pedromoniz.moneytracker.view.mainFlow.addTrackFeature

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pedromoniz.moneytracker.R

class AddTrackFragment : Fragment() {

    companion object {
        fun newInstance() = AddTrackFragment()
    }

    private lateinit var viewModel: AddTrackViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_track_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddTrackViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
