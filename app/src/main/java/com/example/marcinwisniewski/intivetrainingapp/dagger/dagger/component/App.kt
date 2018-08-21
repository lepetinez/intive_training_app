package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector, HasSupportFragmentInjector
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>
    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector
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