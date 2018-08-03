package com.example.marcinwisniewski.intive_training_app.adapter

import android.support.annotation.NonNull
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.android.databinding.library.baseAdapters.BR
import com.example.marcinwisniewski.intive_training_app.vievmodel.ListViewModel


class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(`object`: Any, listViewModel: ListViewModel) {
        //binding.setVariable(BR.`object`, `object`)
        //binding.setVariable(BR.listViewModel, listViewModel)
        binding.executePendingBindings()
    }
}