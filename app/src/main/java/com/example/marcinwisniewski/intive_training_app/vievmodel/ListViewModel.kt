package com.example.marcinwisniewski.intive_training_app.vievmodel

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.api.MovieResponse
import com.example.marcinwisniewski.intive_training_app.fragments.DetailsFragment
import com.example.marcinwisniewski.intive_training_app.model.MovieProvider
import io.reactivex.Observable
import android.support.v4.app.FragmentActivity

class ListViewModel(fragmentActivity2: FragmentActivity?) : ViewModel() {

    @SuppressLint("StaticFieldLeak")
    private val fragmentActivity: FragmentActivity? = fragmentActivity2

    fun getMovies(): Observable<MovieResponse> {
        return MovieProvider.movieProvider.getMoviesResponse()
    }

    fun showMovieDetails() {
        fragmentActivity?.supportFragmentManager!!.beginTransaction()
                .replace(R.id.fragmentContainer, DetailsFragment())
                .addToBackStack(null)
                .commit()
    }
}