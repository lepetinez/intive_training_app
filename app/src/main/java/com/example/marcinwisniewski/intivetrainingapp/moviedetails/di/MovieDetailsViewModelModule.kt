package com.example.marcinwisniewski.intivetrainingapp.moviedetails.di

import android.arch.lifecycle.ViewModelProviders
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.view.fragment.MovieDetailsFragment
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModel
import dagger.Module
import dagger.Provides

@Module
class MovieDetailsViewModelModule {

    @Provides
    fun provideMovieDetailsViewModel(fragment: MovieDetailsFragment): MovieDetailsViewModel {
        return ViewModelProviders.of(fragment).get(MovieDetailsViewModel::class.java)
    }
}