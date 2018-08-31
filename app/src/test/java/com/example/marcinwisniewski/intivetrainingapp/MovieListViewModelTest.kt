package com.example.marcinwisniewski.intivetrainingapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import io.reactivex.Single
import org.junit.Before
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test

class MovieListViewModelTest {

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    companion object {
        @ClassRule
        @JvmField
        val schedulers = RxImmediateSchedulerRule()
    }

    lateinit var movieList: List<Movie>
    lateinit var movieRepository: MovieRepository
    lateinit var movieListViewModel: MovieListViewModel

    @Before
    fun setUp() {
        movieList = listOf(Movie(1, "default", "1991",
                "rewrwdase43", "drama"))
        movieRepository = mock {
            on { getMoviesData() } doReturn Single.just(MovieData(movieList))
        }
        movieListViewModel = MovieListViewModel(movieRepository)
    }

    @Test
    fun checkIfGetMoviesWorks() {
        movieListViewModel.getMovies()
        assert(movieListViewModel.movieList.value == movieList)
    }
}