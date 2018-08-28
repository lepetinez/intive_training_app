package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Movie(@Expose val id: Int,
                 @SerializedName("original_title") val title: String?,
                 @SerializedName("release_date") val year: String?,
                 @SerializedName("poster_path") val poster: String?): Serializable
