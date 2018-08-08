package com.example.marcinwisniewski.intive_training_app.fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marcinwisniewski.intive_training_app.R
import com.example.marcinwisniewski.intive_training_app.databinding.DetailsFragmentBinding

class DetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: DetailsFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.details_fragment, container, false)
        return binding.root
    }
}