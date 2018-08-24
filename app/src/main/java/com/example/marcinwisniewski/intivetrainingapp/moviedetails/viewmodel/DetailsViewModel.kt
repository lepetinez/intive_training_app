package com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

class DetailsViewModel : ViewModel() {

    val choosenMovie: MutableLiveData<Movie> = MutableLiveData()

    fun fetchChoosenMovie(choosenMovie: Movie?) {
        // TODO: after api change, this function will fetch real live data from the api (argument will be movie_ID)
        this.choosenMovie.value = choosenMovie
    }
}