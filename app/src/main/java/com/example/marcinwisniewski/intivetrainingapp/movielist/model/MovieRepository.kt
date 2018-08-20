package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.example.marcinwisniewski.intivetrainingapp.network.MovieService
import io.reactivex.Single
import javax.inject.Inject

const val ALL_MOVIES_URL = "/filippella/Sample-API-Files/master/json/movies-api.json"

class MovieProvider @Inject constructor(val movieService: MovieService) {
    fun getMoviesResponse(): Single<MovieResponse> {
        return movieService.getMovies(ALL_MOVIES_URL)
    }
}