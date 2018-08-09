package com.example.marcinwisniewski.intive_training_app.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Movie : Serializable{

    @SerializedName("id")
    var id: Int = 0
    @SerializedName("title")
    var title: String? = null
    @SerializedName("year")
    var year: String? = null
    @SerializedName("poster")
    var poster: String? = null



}