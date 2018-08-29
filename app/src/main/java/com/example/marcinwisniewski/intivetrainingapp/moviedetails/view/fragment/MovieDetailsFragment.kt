package com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.MovieDetailsFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModel
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MovieDetailsFragment : Fragment() {

    @Inject
    lateinit var movieDetailsViewModel: MovieDetailsViewModel
    //lateinit var movieDetailsViewModelFactory: MovieDetailsViewModelFactory


    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val detailsBinding: MovieDetailsFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.movie_details_fragment, container, false)
        //movieDetailsViewModel = ViewModelProviders.of(this, movieDetailsViewModelFactory).get(MovieDetailsViewModel::class.java)
        detailsBinding.setLifecycleOwner(this)
        detailsBinding.movieDetailsViewModel = movieDetailsViewModel
        return detailsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        savedInstanceState ?: fetchCurrentMovie()
    }

    private fun fetchCurrentMovie() {
        movieDetailsViewModel.fetchChoosenMovie(arguments?.getInt(getString(R.string.current_movie)))
    }
}