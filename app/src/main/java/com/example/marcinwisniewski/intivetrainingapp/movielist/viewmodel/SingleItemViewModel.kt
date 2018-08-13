package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.movielist.model.Movie

data class SingleItemViewModel(val movie: Movie) : ViewModel()