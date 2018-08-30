package com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.DataBindingUtil.getBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.MovieListFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter.MovieListAdapter
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModelFactory
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.movie_list_fragment.view.*
import javax.inject.Inject

class MovieListFragment : Fragment() {

    @Inject
    lateinit var movieListViewModelFactory: MovieListViewModelFactory
    private lateinit var movieListViewModel: MovieListViewModel

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val movieListBinding: MovieListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.movie_list_fragment, container, false)
        movieListBinding.setLifecycleOwner(this)
        movieListViewModel = ViewModelProviders.of(this, movieListViewModelFactory).get(MovieListViewModel::class.java)
        movieListBinding.movieListViewModel = movieListViewModel
        return movieListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAndObserveList(movieListBinding = getBinding<MovieListFragmentBinding>(view) as MovieListFragmentBinding)
    }

    private fun initAndObserveList(movieListBinding: MovieListFragmentBinding) {
        movieListBinding.root.recycler_list.layoutManager = LinearLayoutManager(context)
        val movieListAdapter = MovieListAdapter()
        movieListBinding.root.recycler_list.adapter = movieListAdapter
        movieListViewModel.getMovies()
    }
}