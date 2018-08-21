package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import android.arch.lifecycle.ViewModelProvider
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component.App
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApplication(): App = app

    @Provides
    fun provideListViewModelFactory(
            factory: ListViewModelFactory): ViewModelProvider.Factory = factory
}
