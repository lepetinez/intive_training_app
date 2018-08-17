package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module

import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApplication(): App = app
}