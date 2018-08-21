package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment.DetailsFragment
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeListFragment(): ListFragment

    @ContributesAndroidInjector
    internal abstract fun contributeDetailsFragment(): DetailsFragment
}