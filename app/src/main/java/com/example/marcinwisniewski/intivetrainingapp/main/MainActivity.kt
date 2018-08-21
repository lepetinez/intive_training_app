package com.example.marcinwisniewski.intivetrainingapp.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var listViewModelFactory: ListViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        val viewModel:ListViewModel = ViewModelProviders.of(this,listViewModelFactory).get(ListViewModel::class.java)
        setContentView(R.layout.activity_main)
    }
}
