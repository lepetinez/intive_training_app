package com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.MovieDetailsFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

class MovieDetailsFragment : Fragment() {
    //TODO: viewmodel by dependency injection
    private lateinit var movieDetailsViewModel: MovieDetailsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val detailsBinding: MovieDetailsFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.movie_details_fragment, container, false)
        movieDetailsViewModel = ViewModelProviders.of(this).get(MovieDetailsViewModel::class.java)
        detailsBinding.movieDetailsViewModel = movieDetailsViewModel
        return detailsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO avoid fetching data 2 times
        fetchCurrentMovie()
    }

    private fun fetchCurrentMovie() {
        movieDetailsViewModel.fetchChoosenMovie(arguments?.let {
            it.getSerializable(getString(R.string.current_movie)) as Movie
        })
    }
}
