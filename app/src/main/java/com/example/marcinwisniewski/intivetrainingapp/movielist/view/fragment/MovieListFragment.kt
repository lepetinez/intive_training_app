package com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.MovieListFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter.MovieListAdapter
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.movie_list_fragment.view.*
import javax.inject.Inject

class MovieListFragment : Fragment() {

    @Inject
    lateinit var movieListViewModel: MovieListViewModel
    @Inject
    lateinit var movieListAdapter: MovieListAdapter

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val movieListBinding: MovieListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.movie_list_fragment, container, false)
        movieListBinding.setLifecycleOwner(this)
        movieListBinding.movieListViewModel = movieListViewModel
        initList(movieListBinding.root.recycler_list)
        return movieListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState == null) {
            fetchMovies()
        }
    }

    private fun initList(movieRecyclerList: RecyclerView) {
        movieRecyclerList.layoutManager = LinearLayoutManager(context)
        movieRecyclerList.adapter = movieListAdapter
    }

    private fun fetchMovies() {
        movieListViewModel.getMovies()
    }
}