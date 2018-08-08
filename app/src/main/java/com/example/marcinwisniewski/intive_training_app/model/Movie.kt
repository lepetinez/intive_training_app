package com.example.marcinwisniewski.intive_training_app.model

import com.google.gson.annotations.SerializedName

class Movie {
        /*
        @SerializedName("poster_path") val posterPath: String,
        val id: String,
        val title: String)  {

    fun getPosterUrl(): String {
        return "http://image.tmdb.org/t/p/w342$posterPath"
    }
*/
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("title")
    var title: String? = null
    @SerializedName("year")
    var year: String? = null
    // @SerializedName("overview")
    // var overView : String? = null
    @SerializedName("poster")
    var poster: String? = null
}