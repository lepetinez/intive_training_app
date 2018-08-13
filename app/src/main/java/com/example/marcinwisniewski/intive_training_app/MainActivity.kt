package com.example.marcinwisniewski.intive_training_app

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.arch.lifecycle.Observer
import com.example.marcinwisniewski.intive_training_app.fragments.DetailsFragment
import com.example.marcinwisniewski.intive_training_app.fragments.ListFragment
import com.example.marcinwisniewski.intive_training_app.navigation.FragmentState
import com.example.marcinwisniewski.intive_training_app.navigation.Navigation

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Navigation.navigation.getFragmentState().observe(this, Observer {
            navigateToFragment(it)
        })
    }

    private fun navigateToFragment(state: FragmentState?) {
        when (state) {
            FragmentState.MovieList -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, ListFragment())
                    .commit()
            FragmentState.MovieDetails -> supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, DetailsFragment())
                    .commit()
        }
    }
}