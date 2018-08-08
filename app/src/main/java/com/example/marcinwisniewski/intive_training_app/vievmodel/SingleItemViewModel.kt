package com.example.marcinwisniewski.intive_training_app.vievmodel

import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intive_training_app.model.Movie

class SingleItemViewModel(movie: Movie) : ViewModel() {

    private val movie: Movie? = movie

    fun getTitle(): String? {
        if (movie != null) {
            return movie.title
        } else {
            return "No title"
        }
    }

    fun getPoster(): String? {
        if (movie != null) {
            return movie.poster
        } else {
            return "No Poster"
        }
    }

    fun getYear(): String? {
        if (movie != null) {
            return movie.year
        } else {
            return "No Year"
        }
    }
}