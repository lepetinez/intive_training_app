package com.example.marcinwisniewski.intive_training_app.fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.adapter.MyAdapter
import com.example.marcinwisniewski.intive_training_app.databinding.ListFragmentBinding
import com.example.marcinwisniewski.intive_training_app.model.Movie
import kotlinx.android.synthetic.main.list_fragment.view.*


class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: ListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        val recyclerView = binding.root.recycler_list
        val mLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = mLayoutManager
        val list = ArrayList<Movie>()
        for (i in 0..99) {
            list.add(Movie(i.toString()))
        }

        val listAdapter = MyAdapter(list)
        binding.root.recycler_list.adapter = listAdapter
        listAdapter.setOnItemClickListener(object : MyAdapter.OnItemClickListener {
            override fun onClick(view: View, data: Movie) {
                Toast.makeText(context, data.title, Toast.LENGTH_LONG).show()
            }
        })
        return binding.root
    }
}