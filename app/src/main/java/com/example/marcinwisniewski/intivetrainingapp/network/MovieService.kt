package com.example.marcinwisniewski.intivetrainingapp.network

import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Url

interface MovieService {
    @GET
    fun getMovies(@Url url: String): Single<MovieResponse>
}