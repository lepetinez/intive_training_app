package com.example.marcinwisniewski.intive_training_app.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.marcinwisniewski.intive_training_app.vievmodel.ListViewModel
import android.support.v7.widget.RecyclerView.ViewHolder
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater



abstract class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.getContext())
        val binding :ViewDataBinding = DataBindingUtil.inflate(layoutInflater, viewType, parent, false)
        return CustomAdapter(binding.root)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val listViewModel : ListViewModel = ListViewModel()
        holder.bind(objectt,listViewModel)
    }

    override fun getItemViewType(position: Int): Int {
       return position
    }



class CustomView(val)
}


