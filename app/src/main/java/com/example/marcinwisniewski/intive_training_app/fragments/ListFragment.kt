package com.example.marcinwisniewski.intive_training_app.fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.adapter.MyAdapter
import com.example.marcinwisniewski.intive_training_app.api.MovieResponse
import com.example.marcinwisniewski.intive_training_app.databinding.ListFragmentBinding
import com.example.marcinwisniewski.intive_training_app.model.Movie
import com.example.marcinwisniewski.intive_training_app.vievmodel.ListViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.list_fragment.view.*
import retrofit2.Call
import retrofit2.Callback


class ListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: ListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        val recyclerView = binding.root.recycler_list
        val mLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = mLayoutManager
        val ListViewModel = ListViewModel(this.activity)
        binding.viewModel = ListViewModel
        val listAdapter = MyAdapter()
        binding.root.recycler_list.adapter = listAdapter
        binding.viewModel!!.getMovies()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    var movieResponse: MovieResponse = it
                    listAdapter.setMovies(it.results!!)
                },{
                })

        listAdapter.setOnItemClickListener(object : MyAdapter.OnItemClickListener {
            override fun onClick(view: View, data: Movie) {
                ListViewModel.showMovieDetails()
            }
        })

        return binding.root
    }
}