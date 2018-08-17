package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import com.example.marcinwisniewski.intivetrainingapp.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface NetworkComponent {
    fun inject(activity:MainActivity)
}