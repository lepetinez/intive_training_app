package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.MovieListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    internal abstract fun contributeMovieListFragment(): MovieListFragment
}