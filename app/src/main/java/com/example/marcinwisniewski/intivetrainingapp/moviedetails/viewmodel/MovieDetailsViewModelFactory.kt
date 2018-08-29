package com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import javax.inject.Inject

class MovieDetailsViewModelFactory @Inject constructor(private val repository: MovieRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)) {
            return MovieDetailsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}