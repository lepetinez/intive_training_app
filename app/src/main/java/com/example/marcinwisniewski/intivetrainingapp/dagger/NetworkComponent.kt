package com.example.marcinwisniewski.intivetrainingapp.dagger

import com.example.marcinwisniewski.intivetrainingapp.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface NetworkComponent {
    fun inject(activity: MainActivity)
}