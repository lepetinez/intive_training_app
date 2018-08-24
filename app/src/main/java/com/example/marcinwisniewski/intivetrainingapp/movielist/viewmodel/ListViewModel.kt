package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ListViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {

    private val moviesList = MutableLiveData<List<Movie>>()
    
    fun getMovies() {
        // TODO: create handle error mechanism and disposable
        movieRepository.getMoviesResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    moviesList.value = it.data
                }) {
                }
    }
}
