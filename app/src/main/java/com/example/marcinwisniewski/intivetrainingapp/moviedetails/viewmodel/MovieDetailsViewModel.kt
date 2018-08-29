package com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieDetailsViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {

    private val mutableMovie: MutableLiveData<Movie> = MutableLiveData()
    val choosenMovie: LiveData<Movie> = mutableMovie
    private lateinit var movieDisposable: Disposable

    fun fetchChoosenMovie(movieId: Int?) {

        movieDisposable = (movieRepository.getSingleMovie(movieId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    mutableMovie.value = it
                }) {
                    throw (RuntimeException(it.message))
                })
    }

    override fun onCleared() {
        super.onCleared()
        movieDisposable.dispose()
    }
}