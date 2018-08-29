package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Movie(
        @Expose val id: Int?,
        @Expose val title: String?,
        @SerializedName("release_date") val year: String?,
        @SerializedName("poster_path") val poster: String?,
        @Expose val overview: String?,
        @Expose val popularity: String?,
        @SerializedName("vote_average") val voteAverage: String?,
        @SerializedName("vote_count") val voteCount: String?
) : Serializable