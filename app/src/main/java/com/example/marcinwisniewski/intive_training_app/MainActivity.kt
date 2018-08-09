package com.example.marcinwisniewski.intive_training_app

import android.os.Bundle
import android.support.v4.app.FragmentActivity

import com.example.marcinwisniewski.intive_training_app.fragments.ListFragment

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ListFragment())
                .commit()
    }

}

