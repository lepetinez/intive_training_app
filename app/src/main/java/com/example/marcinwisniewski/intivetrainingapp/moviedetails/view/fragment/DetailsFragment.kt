package com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.DetailsFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.DetailsViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

class DetailsFragment : Fragment() {

    private lateinit var viewModel: DetailsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val detailsBinding: DetailsFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.details_fragment, container, false)
        viewModel = ViewModelProviders.of(this).get(DetailsViewModel::class.java)
        detailsBinding.viewModel = viewModel
        return detailsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchCurrentMovie()
    }

    private fun fetchCurrentMovie() {
        viewModel.fetchChoosenMovie(arguments?.getSerializable(getString(R.string.current_movie)) as Movie?)
    }
}