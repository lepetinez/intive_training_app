package com.example.marcinwisniewski.intive_training_app.navigation

import android.arch.lifecycle.MutableLiveData
import com.example.marcinwisniewski.intive_training_app.model.Movie

class Navigation {

    private val fragmentState: MutableLiveData<FragmentState> = MutableLiveData()
    private var choosenMovie: Movie = Movie()

    init {
        fragmentState.value = FragmentState.MovieList
    }

    companion object {
        val navigation: Navigation by lazy {
            Navigation()
        }
    }

    fun setFragmentState(fragmentState:FragmentState){
        this.fragmentState.value = fragmentState
    }

    fun getFragmentState():MutableLiveData<FragmentState>{
        return fragmentState
    }
}