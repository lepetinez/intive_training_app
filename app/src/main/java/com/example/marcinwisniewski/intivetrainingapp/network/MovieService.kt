package com.example.marcinwisniewski.intivetrainingapp.network

import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    //@GET
    //fun getMovies(@Url url: String): Single<MovieData> working set !!!
    //
    @GET("movie/popular")
    fun getMovies(@Query("api_key") apikey:String): Single<MovieData>

    @GET("movie/top_rated")
    fun getTopMovies(@Query("api_key") apikey:String): Single<MovieData>
}