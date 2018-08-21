package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import java.io.Serializable

data class Movie(val id: Int, val title: String?, val year: String?, val poster: String?, val genre: String?) : Serializable