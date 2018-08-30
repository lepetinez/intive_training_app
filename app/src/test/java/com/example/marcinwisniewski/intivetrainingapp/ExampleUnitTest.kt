package com.example.marcinwisniewski.intivetrainingapp

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieRepository
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.MovieListViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    lateinit var listViewModel: MovieListViewModel

    @Mock
    lateinit var appDatabase: MovieRepository

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
