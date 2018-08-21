package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.main.MainActivity
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment.DetailsFragment
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}