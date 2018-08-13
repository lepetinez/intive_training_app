package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ListViewModel : ViewModel() {
    fun getMovies(): MutableLiveData<List<Movie>> {
        val moviesList = MutableLiveData<List<Movie>>()
        MovieProvider.movieProvider.getMoviesResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    moviesList.value = it.data
                }) {
                }
        return moviesList
    }
}
