package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component.NetworkComponent

class App : Application() {
    lateinit var component: NetworkComponent
    /*val component: NetworkComponent by lazy {
        DaggerNetworkComponent.builder()
                .appModule(AppModule(this))
                .netModule(NetworkModule())
                .build()
    }
*/
    override fun onCreate() {
        super.onCreate()
        //component
              // .builder()
                //.appModule(AppModule(this))
                //.networkModule(NetworkModule())
                //.build()
    }
}