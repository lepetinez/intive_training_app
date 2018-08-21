package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ListViewModel @Inject constructor(
    private val movieRepository: MovieProvider
) : ViewModel() {
    fun getMovies(): MutableLiveData<List<Movie>> {
        // TODO: create handle error mechanism
        val moviesList = MutableLiveData<List<Movie>>()
        movieRepository.getMoviesResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    moviesList.value = it.data
                }) {
                }
        return moviesList
    }
}
