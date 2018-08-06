package com.example.marcinwisniewski.intive_training_app.adapter

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

    @BindingAdapter("bind:poster")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.get().load(url).resize(200, 200).into(imageView)
    }
