package com.example.marcinwisniewski.intivetrainingapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://raw.githubusercontent.com"

class ApiFactory {
    companion object {
        fun getMovieService(): MovieService {
                val retrofitInstance = Retrofit.Builder().baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build()
            return retrofitInstance.create(MovieService::class.java)
        }
    }
}