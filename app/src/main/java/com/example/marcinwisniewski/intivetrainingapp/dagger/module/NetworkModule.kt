package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.network.MovieService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

const val BASE_URL = "https://raw.githubusercontent.com"

@Module
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