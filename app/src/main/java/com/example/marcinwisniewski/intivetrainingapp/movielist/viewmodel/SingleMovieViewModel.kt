package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

data class SingleMovieViewModel(val movie: Movie) {

    fun showMovieDetails(view: View) {
        val movieBundle = Bundle().apply {
            putSerializable(view.context.getString(R.string.current_movie), movie)
        }
        view.findNavController().navigate(R.id.movieDetailsFragment, movieBundle)
    }
}