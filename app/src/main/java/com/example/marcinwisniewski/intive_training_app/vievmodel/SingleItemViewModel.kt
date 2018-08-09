package com.example.marcinwisniewski.intive_training_app.vievmodel

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.fragments.DetailsFragment
import com.example.marcinwisniewski.intive_training_app.model.Movie
import android.support.v4.app.FragmentActivity
import android.os.Bundle




data class SingleItemViewModel(val movie: Movie, @field:SuppressLint("StaticFieldLeak") private val fragmentActivity: FragmentActivity?) : ViewModel() {
/*
    private val movie: Movie? = movie
    @SuppressLint("StaticFieldLeak")


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
    fun getMovie():Movie?{
        return movie
    }
*/
    fun showMovieDetails(movie:Movie) {
        val detailsFragment= DetailsFragment()
        val bundle = Bundle()
        bundle.putSerializable("choosenMovie", movie)
        detailsFragment.arguments = bundle
        fragmentActivity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, DetailsFragment())
                .commit()
    }


}