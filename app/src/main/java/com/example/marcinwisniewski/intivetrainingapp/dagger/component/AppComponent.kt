package com.example.marcinwisniewski.intivetrainingapp.dagger.component

import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.module.FragmentModule
import com.example.marcinwisniewski.intivetrainingapp.main.MovieApplication
import com.example.marcinwisniewski.intivetrainingapp.moviedetails.di.MovieDetailsViewModelModule
import com.example.marcinwisniewski.intivetrainingapp.movielist.di.MovieListViewModelModule
import com.example.marcinwisniewski.intivetrainingapp.network.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AndroidInjectionModule::class,
    FragmentModule::class, AndroidSupportInjectionModule::class, MovieListViewModelModule::class,
    MovieDetailsViewModelModule::class, AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MovieApplication)
}