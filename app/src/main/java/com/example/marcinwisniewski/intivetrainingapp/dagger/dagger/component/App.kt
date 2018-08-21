package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import android.app.Activity
import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
    override fun onCreate() {
        super.onCreate()
        DaggerNetworkComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()
                .inject(this)
    }
}