package com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.databinding.ListRowBinding
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.SingleItemViewModel

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.BindingHolder>() {
    private val movies: MutableList<Movie> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListRowBinding.inflate(layoutInflater, parent, false)
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val data = movies[position]
        holder.binding.singleItemViewModel = SingleItemViewModel(data)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun setMovies(data: List<Movie>) {
        movies.clear()
        movies.addAll(data)
        notifyDataSetChanged()
    }

    class BindingHolder(var binding: ListRowBinding) : RecyclerView.ViewHolder(binding.root)
}
