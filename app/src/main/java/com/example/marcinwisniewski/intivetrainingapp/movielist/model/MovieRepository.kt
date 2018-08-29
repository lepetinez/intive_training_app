package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.example.marcinwisniewski.intivetrainingapp.BuildConfig
import com.example.marcinwisniewski.intivetrainingapp.network.MovieService
import io.reactivex.Single
import javax.inject.Inject

class MovieRepository @Inject constructor(private val movieService: MovieService) {

    fun getMoviesData(): Single<MovieData> {
        return movieService.getMovies(BuildConfig.THE_MOVIE_DB_API_TOKEN)
    }

    fun getSingleMovie(movieId: Int?): Single<Movie> {
        return movieService.getMovieDetails(movieId, BuildConfig.THE_MOVIE_DB_API_TOKEN)
    }
}