package com.example.marcinwisniewski.intivetrainingapp.dagger.module

import android.arch.lifecycle.ViewModel
import com.example.marcinwisniewski.intivetrainingapp.dagger.ViewModelKey
import com.example.marcinwisniewski.intivetrainingapp.movielist.viewmodel.ListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel::class)
    abstract fun bindMainViewModel(viewModel: ListViewModel): ViewModel
}