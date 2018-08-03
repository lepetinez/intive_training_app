package com.example.marcinwisniewski.intive_training_app.interfaces

import com.example.marcinwisniewski.intive_training_app.api.MovieResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiMovies{
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies(): Observable<MovieResponse>
}