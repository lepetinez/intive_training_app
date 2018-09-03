package com.example.marcinwisniewski.intivetrainingapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.BASE_URL
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import com.example.marcinwisniewski.intivetrainingapp.network.MovieService
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MovieRepositoryTest {

//    @Rule
//    @JvmField
//    var rule = InstantTaskExecutorRule()
//
//    lateinit var movieRepository: MovieRepository
//    lateinit var movieService: MovieService
//    lateinit var movieList: List<Movie>
//
//    @Before
//    fun setUp() {
//        movieList = listOf(Movie(1, "default", "1991",
//                "rewrwdase43", "drama"))
//        movieService = mock {
//            on { getMovies(BASE_URL) } doReturn Single.just(MovieData(movieList))
//        }
//        movieRepository = MovieRepository(movieService)
//    }
//
//    @Test
//    fun checkIfGetMoviesWorks() {
//
//        assert(movieRepository.getMoviesData() == Single.just(MovieData(movieList)))
//    }
}