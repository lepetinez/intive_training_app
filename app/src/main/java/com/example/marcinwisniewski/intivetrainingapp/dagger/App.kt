package com.example.marcinwisniewski.intivetrainingapp.dagger

import android.app.Application

class App : Application() {
    lateinit var component: NetworkComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerNetworkComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()
    }
}