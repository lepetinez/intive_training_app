package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.BuildersModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class,AndroidInjectionModule::class, BuildersModule::class])
interface NetworkComponent {
    fun inject(app: App)
}