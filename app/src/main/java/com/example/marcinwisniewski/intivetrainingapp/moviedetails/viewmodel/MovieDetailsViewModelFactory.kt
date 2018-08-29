package com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

class MovieDetailsViewModelFactory @Inject constructor(private val movieDetailsViewModel: MovieDetailsViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)) {
            return movieDetailsViewModel as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}