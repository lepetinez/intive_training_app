package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class ListViewModel @Inject constructor(private val movieRepository: MovieProvider) : ViewModel() {
    var moviesList: MutableLiveData<List<Movie>> = MutableLiveData()
    private val disposables = CompositeDisposable()
    fun getMovies() {
        // TODO: create handle error mechanism
        disposables.add(movieRepository.getMoviesResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    moviesList.value = it.data
                }) {
                })
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}