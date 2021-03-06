package com.example.marcinwisniewski.intivetrainingapp.movielist.view.adapter

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

const val IMAGE_WIDTH = 200
const val IMAGE_HEIGHT = 200

@BindingAdapter("bind:poster")
fun ImageView.loadImage(url: String?) {
    Picasso.get().load(url).resize(IMAGE_WIDTH, IMAGE_HEIGHT).into(this)
}