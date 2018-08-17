package com.example.marcinwisniewski.intivetrainingapp.movielist.model

import android.os.Parcel
import android.os.Parcelable

data class Movie(val id: Int, val title: String?, val year: String?, val poster: String?, val genre: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
// TODO will be changed because now the object should be parcelable to pass to bundle - after changing api it will be normal object again