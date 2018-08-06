package com.example.marcinwisniewski.intive_training_app.model

import com.example.marcinwisniewski.intive_training_app.BuildConfig
import com.example.marcinwisniewski.intive_training_app.api.Client
import com.example.marcinwisniewski.intive_training_app.api.MovieResponse
import com.example.marcinwisniewski.intive_training_app.interfaces.ApiMovies
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MovieProvider {
    var retrofit : Retrofit? = null
    companion object {
        val movieProvider:MovieProvider by lazy {
            MovieProvider()
        }


    }

    fun getRetrofitReference():Retrofit?{
        if(retrofit == null) {
            retrofit = Retrofit
                    .Builder()
                    .baseUrl(Client.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
        }
        return retrofit
    }

    fun getMoviesResponse(): Observable<MovieResponse> {
       return getRetrofitReference()!!.create(ApiMovies::class.java).getPopularMovies(BuildConfig.THE_MOVIE_DB_API_TOKEN)
    }







}