package com.example.marcinwisniewski.intivetrainingapp.dagger.component

import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.FragmentModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.NetworkModule
import com.example.marcinwisniewski.intivetrainingapp.main.MovieApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AndroidInjectionModule::class,
    FragmentModule::class, AndroidSupportInjectionModule::class, AppModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MovieApplication)

}