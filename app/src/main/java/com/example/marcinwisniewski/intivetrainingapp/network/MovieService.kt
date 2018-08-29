package com.example.marcinwisniewski.intivetrainingapp.network

import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    fun getMovies(@Query("api_key") apikey: String): Single<MovieData>

    @GET("/3/movie/{id}")
    fun getMovieDetails(@Path("id") movieID: Int?, @Query("api_key") apiKey: String): Single<Movie>
}