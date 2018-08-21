package com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.component

import android.app.Application
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.AppModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.BuildersModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.FragmentModule
import com.example.marcinwisniewski.intivetrainingapp.dagger.dagger.module.NetworkModule
import com.example.marcinwisniewski.intivetrainingapp.movielist.view.fragment.ListFragment
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, AndroidInjectionModule::class, BuildersModule::class, FragmentModule::class, AndroidSupportInjectionModule::class])
interface NetworkComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): NetworkComponent
    }

    fun inject(app: App)
    fun inject (fragment: ListFragment)
}