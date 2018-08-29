package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment.MovieDetailsFragment
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.MovieListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector (modules = [AppModule::class])
    internal abstract fun contributeMovieListFragment(): MovieListFragment

    @ContributesAndroidInjector (modules = [AppModule::class])
    internal abstract fun contributeMovieDetailsFragment(): MovieDetailsFragment
}