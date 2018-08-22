package com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.databinding.ListFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter.MovieListAdapter
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.list_fragment.view.*

// TODO: Format and DI
class ListFragment : Fragment() {
    private lateinit var viewModel: ListViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val listBinding: ListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        initAndObserveList(listBinding)
        return listBinding.root
    }

    // TODO: screen orientation - fetch 2x
    private fun initAndObserveList(listBinding: ListFragmentBinding) {
        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        listBinding.viewModel = viewModel
        listBinding.root.recycler_list.layoutManager = LinearLayoutManager(context)
        val listAdapter = MovieListAdapter()
        listBinding.root.recycler_list.adapter = listAdapter
        // TODO : try to avoid observing list in fragment
        viewModel.getMovies().observe(this, Observer { it ->
            it?.let {
                listAdapter.setMovies(it)
            }
        })
    }
}