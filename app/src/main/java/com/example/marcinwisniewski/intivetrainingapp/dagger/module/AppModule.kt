package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment.MovieDetailsFragment
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModel
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModelFactory
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.MovieListFragment
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideMovieListViewModelFactory(factory: MovieListViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    fun provideMovieDetailsViewModelFactory(factory: MovieDetailsViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    fun provideMovieDetailsViewModel(fragment: MovieDetailsFragment, factory: MovieDetailsViewModelFactory): MovieDetailsViewModel {
        return ViewModelProviders.of(fragment, factory).get(MovieDetailsViewModel::class.java)
    }

    @Provides
    fun provideMovieListViewModel(fragment: MovieListFragment, factory: MovieListViewModelFactory): MovieListViewModel {
        return ViewModelProviders.of(fragment, factory).get(MovieListViewModel::class.java)
    }
}