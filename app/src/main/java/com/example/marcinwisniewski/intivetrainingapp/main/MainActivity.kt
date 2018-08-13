package com.example.marcinwisniewski.intivetrainingapp.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.marcinwisniewski.intivetrainingapp.R
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ListFragment())
                .commit()
    }
}
