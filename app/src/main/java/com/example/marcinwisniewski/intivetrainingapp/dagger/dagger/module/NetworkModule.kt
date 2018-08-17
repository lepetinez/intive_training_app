package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.network.MovieService
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import javax.inject.Singleton
import dagger.Provides
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

const val BASE_URL = "https://raw.githubusercontent.com"

class NetworkModule {
    @Provides
    @Singleton
    fun getMovieService(): MovieService {
        val retrofitInstance = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return retrofitInstance.create(MovieService::class.java)
    }
}