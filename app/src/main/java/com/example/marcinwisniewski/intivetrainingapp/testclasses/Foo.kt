package com.example.marcinwisniewski.intivetrainingapp.testclasses

import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.MovieData
import io.reactivex.Single

class Foo {
    fun calculateTheFoo(): Single<MovieData> {
        return Single.just(MovieData(listOf(Movie(1, "tytul",
                "piesek", "kotek", "piesek"))))
    }
}
