package com.example.marcinwisniewski.intivetrainingapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.marcinwisniewski.intivetrainingapp.view.ListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ListFragment())
                .commit()
    }
}
