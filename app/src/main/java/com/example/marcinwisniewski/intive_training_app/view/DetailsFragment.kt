package com.example.marcinwisniewski.intive_training_app.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.databinding.DetailsFragmentBinding
import com.example.marcinwisniewski.intive_training_app.viewmodel.DetailsViewModel


class DetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val detailsBinding: DetailsFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.details_fragment, container, false)
        detailsBinding.viewModel = ViewModelProviders.of(this).get(DetailsViewModel::class.java)
        return detailsBinding.root
    }
}