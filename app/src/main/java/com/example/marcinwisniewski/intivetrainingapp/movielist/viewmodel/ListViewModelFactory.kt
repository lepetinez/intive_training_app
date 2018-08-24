package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject

class ListViewModelFactory @Inject constructor(private val listViewModel: ListViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            return listViewModel as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}