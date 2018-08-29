package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import android.arch.lifecycle.ViewModelProvider
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModelFactory
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideMovieListViewModelFactory(factory: MovieListViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    fun provideMovieDetailsViewModelFactory(factory: MovieDetailsViewModelFactory): ViewModelProvider.Factory = factory
}