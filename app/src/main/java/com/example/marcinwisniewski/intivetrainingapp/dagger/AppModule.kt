package com.example.marcinwisniewski.intivetrainingapp.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApplication(): App = app
}