package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import android.arch.lifecycle.ViewModelProvider
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModelFactory
import dagger.Module
import dagger.Provides

@Module
internal class AppModule {
    @Provides
    fun provideListViewModelFactory(
            factory: ListViewModelFactory): ViewModelProvider.Factory = factory
}
