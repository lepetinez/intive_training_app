package com.example.marcinwisniewski.intive_training_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.marcinwisniewski.intive_training_app.view.ListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ListFragment())
                .commit()
    }
}
