package com.example.marcinwisniewski.intivetrainingapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.viewmodel.MovieDetailsViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import org.amshove.kluent.shouldBe
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MovieDetailsViewModelTest {

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()
    lateinit var movieDetailsViewModel: MovieDetailsViewModel
    lateinit var movie: Movie

    @Before
    fun setUp() {
        movie = Movie(1, "default", "1991",
                "rewrwdase43", "drama")
        movieDetailsViewModel = MovieDetailsViewModel()
    }

    @Test
    fun checkIfGetMoviesWorks() {
        movieDetailsViewModel.fetchChoosenMovie(movie)
        movieDetailsViewModel.choosenMovie.value shouldBe movie
    }
}