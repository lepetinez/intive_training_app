package com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment

import android.arch.lifecycle.Observer
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

class DetailsFragment : Fragment() {
    private lateinit var detailsBinding: DetailsFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        detailsBinding = DataBindingUtil.inflate(layoutInflater, R.layout.details_fragment, container, false)
        detailsBinding.viewModel = ViewModelProviders.of(this).get(DetailsViewModel::class.java)
        observeCurrentMovie()
        return detailsBinding.root
    }

    fun observeCurrentMovie() {
        detailsBinding.viewModel
                ?.fetchChoosenMovie(arguments?.getParcelable(getString(R.string.current_movie)))
                ?.observe(this, Observer {
                    if (it != null) {
                        detailsBinding.viewModel!!.setMovie(it)
                    }
                })
    }
}