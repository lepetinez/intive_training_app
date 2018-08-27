package com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter

import android.arch.lifecycle.LiveData
import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

@BindingAdapter("movieList")
fun RecyclerView.setMovieListToRecyclerview(movieList: LiveData<List<Movie>>) {
    if (adapter is MovieListAdapter) {
        movieList.value?.let {
            (adapter as MovieListAdapter).setMovies(it)
        }
    }
}