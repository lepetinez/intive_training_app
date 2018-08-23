package com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter

import android.arch.lifecycle.MutableLiveData
import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

@BindingAdapter("data")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, items: MutableLiveData<List<Movie>>) {
    if (recyclerView.adapter is MovieListAdapter) {
        (recyclerView.adapter as MovieListAdapter).setMovies(items.value)
    }
}