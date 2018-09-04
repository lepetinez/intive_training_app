package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter.MovieListAdapter
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideMovieListAdapter(): MovieListAdapter {
        return MovieListAdapter()
    }
}