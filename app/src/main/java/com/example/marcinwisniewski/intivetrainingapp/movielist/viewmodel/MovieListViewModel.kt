package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieListViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {

    private val mutableMovieList: MutableLiveData<List<Movie>> = MutableLiveData()
    val movieList: LiveData<List<Movie>> = mutableMovieList
    private lateinit var movieListDisposable: Disposable
    var string = "helooo"
    fun getMovies() {
        Log.d("wywolalem sie", "wywolalem sie")
        movieListDisposable = (movieRepository.getMoviesData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    mutableMovieList.value = it.results
                }) {
                    throw (RuntimeException(it.message))
                })
    }

    override fun onCleared() {
        super.onCleared()
        movieListDisposable.dispose()
    }
}