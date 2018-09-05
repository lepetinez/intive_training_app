package com.example.marcinwisniewski.intivetrainingapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import org.amshove.kluent.shouldBe
import org.junit.Rule
import org.junit.Test

const val DEFULT_MOVIE_ID = 1
const val DEFULT_MOVIE_TITLE = "title"
const val DEFULT_MOVIE_POSTER = "default/3"
const val DEFULT_MOVIE_YEAR = "1991"
const val DEFULT_MOVIE_GENRE = "dramat"

class MovieListViewModelTest {

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    @Rule
    @JvmField
    val schedulers = RxImmediateSchedulerRule()

    var mockedMovieRepository: MovieRepository = mock()
    var testedMovieListViewModel: MovieListViewModel = MovieListViewModel(mockedMovieRepository)

    @Test
    fun should_return_empty_movie_list_when_asked_in_viewmodel() {
        val emptyMovieList = emptyList<Movie>()
        whenever(mockedMovieRepository.getMoviesData()).thenReturn(Single.just(MovieData(emptyMovieList)))

        testedMovieListViewModel.getMovies()

        testedMovieListViewModel.movieList.value shouldBe emptyMovieList
    }

    @Test
    fun should_return_movie_list_when_asked_in_viewmodel() {
        val movieList = listOf(Movie(DEFULT_MOVIE_ID, DEFULT_MOVIE_TITLE, DEFULT_MOVIE_YEAR,
                DEFULT_MOVIE_GENRE, DEFULT_MOVIE_POSTER))
        whenever(mockedMovieRepository.getMoviesData()).thenReturn(Single.just(MovieData(movieList)))

        testedMovieListViewModel.getMovies()

        testedMovieListViewModel.movieList.value shouldBe movieList
    }
}