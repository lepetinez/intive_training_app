package com.example.marcinwisniewski.intivetrainingapp.movielist.di

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.MovieListFragment
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieListViewModelModule {

    @Provides
    fun provideMovieListViewModelFactory(factory: MovieListViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    fun provideMovieListViewModel(fragment: MovieListFragment, factory: MovieListViewModelFactory): MovieListViewModel {
        return ViewModelProviders.of(fragment, factory).get(MovieListViewModel::class.java)
    }
}