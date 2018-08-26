package com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment

import android.arch.lifecycle.Observer
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
import com.example.marcinwisniewski.intivetrainingapp.databinding.ListFragmentBinding
import com.example.marcinwisniewski.intivetrainingapp.main.ViewModelFactory
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter.MovieListAdapter
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModel
<<<<<<< HEAD
=======
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModelFactory
>>>>>>> 2c0b41d1fc2660f802120cb85dc8cc4bebf5f5dc
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.list_fragment.view.*
import javax.inject.Inject

class ListFragment : Fragment() {
    @Inject
<<<<<<< HEAD
    lateinit var listViewModelFactory: ViewModelFactory
=======
    lateinit var listViewModelFactory: ListViewModelFactory
>>>>>>> 2c0b41d1fc2660f802120cb85dc8cc4bebf5f5dc
    private lateinit var viewModel: ListViewModel
    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val listBinding: ListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAndObserveList(listBinding = getBinding<ListFragmentBinding>(view) as ListFragmentBinding)
    }

    private fun initAndObserveList(listBinding: ListFragmentBinding) {
        viewModel = ViewModelProviders.of(this, listViewModelFactory).get(ListViewModel::class.java)
        listBinding.viewModel = viewModel
        listBinding.root.recycler_list.layoutManager = LinearLayoutManager(context)
        val listAdapter = MovieListAdapter()
        listBinding.root.recycler_list.adapter = listAdapter
        // TO DO : try to avoid observing list in fragment
        viewModel.getMovies().observe(this, Observer { it ->
            it?.let {
                listAdapter.setMovies(it)
            }
        })
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAndObserveList(listBinding = getBinding<ListFragmentBinding>(view) as ListFragmentBinding)
    }
}