package com.example.marcinwisniewski.intive_training_app.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.databinding.ListFragmentBinding
import com.example.marcinwisniewski.intive_training_app.viewmodel.ListViewModel

class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val listBinding: ListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_fragment, container, false)
        listBinding.viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        return listBinding.root
    }
}