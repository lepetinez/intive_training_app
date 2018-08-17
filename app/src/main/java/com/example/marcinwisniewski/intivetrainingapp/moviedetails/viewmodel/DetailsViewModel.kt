package com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

class DetailsViewModel : ViewModel() {
    private val choosenMovie: MutableLiveData<Movie> = MutableLiveData()
    private var movie: ObservableField<Movie> = ObservableField()
    fun getMovie(): Movie? {
        return movie.get()
    }

    fun setMovie(movie: Movie) {
        this.movie.set(movie)
    }

    fun fetchChoosenMovie(choosenMovie: Movie?): MutableLiveData<Movie> {
        // TODO: after api change, this function will fetch real live data from the api (argument will be movie_ID)
        this.choosenMovie.value = choosenMovie
        return this.choosenMovie
    }
}