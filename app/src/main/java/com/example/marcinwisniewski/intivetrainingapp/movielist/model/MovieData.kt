package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.google.gson.annotations.SerializedName

data class MovieData(@SerializedName("results")val results: List<Movie>?)