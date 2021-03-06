package com.example.marcinwisniewski.intivetrainingapp.network.di

import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
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
    fun provideMovieRepository(movieService: MovieService): MovieRepository {
        return MovieRepository(movieService)
    }

    @Provides
    @Singleton
    fun getMovieService(retrofitInstance: Retrofit): MovieService {
        return retrofitInstance.create(MovieService::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}