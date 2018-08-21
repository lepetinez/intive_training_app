package com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.util.Log
import javax.inject.Inject

class ListViewModelFactory @Inject constructor(private val listViewModel: ListViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        Log.d("freddy","jutroo")
        if (modelClass.isAssignableFrom(ListViewModel::class.java)) {
            Log.d("freddy","jutroo")
            return listViewModel as T

        }
        throw IllegalArgumentException("Unknown class name")
    }
}