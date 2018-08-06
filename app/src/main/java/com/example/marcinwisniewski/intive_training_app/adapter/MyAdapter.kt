package com.example.marcinwisniewski.intive_training_app.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intive_training_app.databinding.SingleItemBinding
import com.example.marcinwisniewski.intive_training_app.model.Movie
import com.example.marcinwisniewski.intive_training_app.vievmodel.ListViewModel

class MyAdapter() : RecyclerView.Adapter<MyAdapter.BindingHolder>() {
    lateinit var listener: OnItemClickListener
    private val movies :MutableList<Movie> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        setOnItemClickListener(listener)
        val layoutInflater = LayoutInflater.from(parent!!.context)
        val binding = SingleItemBinding.inflate(layoutInflater, parent, false)
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val data = movies[position]
        holder.binding.setMovie(data)
        holder.binding.originalLinearLayout.setOnClickListener {
            listener.onClick(it, data)
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    interface OnItemClickListener {
        fun onClick(view: View, data: Movie)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    fun setMovies (data:List<Movie>){
        movies.addAll(data)
        notifyDataSetChanged()
    }

    class BindingHolder(var binding: SingleItemBinding) : RecyclerView.ViewHolder(binding.root)
}