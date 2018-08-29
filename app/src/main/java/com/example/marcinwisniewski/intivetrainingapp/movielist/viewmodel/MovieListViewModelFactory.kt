package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import javax.inject.Inject

class MovieListViewModelFactory @Inject constructor(private val movieRepository: MovieRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieListViewModel::class.java)) {
            return MovieListViewModel(movieRepository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}