package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import android.app.Activity
import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule

class App : Application() {
     //lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    override fun onCreate() {
        super.onCreate()
        DaggerNetworkComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()
    }
}