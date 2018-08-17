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

class ListFragment : Fragment() {
    private lateinit var listBinding: ListFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        listBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        listBinding.viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        initAndObserveList()
        return listBinding.root
    }

    private fun initAndObserveList() {
        val recyclerView = listBinding.root.recycler_list
        recyclerView.layoutManager = LinearLayoutManager(context)
        val listAdapter = MovieListAdapter()
        listBinding.root.recycler_list.adapter = listAdapter
        // TO DO : try to avoid observing list in fragment
        listBinding.viewModel?.getMovies()?.observe(this, Observer {
            if (it != null) {
                listAdapter.setMovies(it)
            }
        })
    }
}