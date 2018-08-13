package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.example.marcinwisniewski.intivetrainingapp.network.ApiFactory
import io.reactivex.Single

const val ALL_MOVIES_URL = "/filippella/Sample-API-Files/master/json/movies-api.json"

class MovieProvider {
    // TO DO : set and dependency injection mechanism after the 1 sprint ends.
    companion object {
        val movieProvider: MovieProvider by lazy {
            MovieProvider()
        }
    }

    fun getMoviesResponse(): Single<MovieResponse> {
        return ApiFactory.getMovieService().getMovies(ALL_MOVIES_URL)
    }
}