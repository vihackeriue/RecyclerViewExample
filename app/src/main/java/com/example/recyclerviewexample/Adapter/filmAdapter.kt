package com.example.recyclerviewexample.Adapter

import android.annotation.SuppressLint
import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.FilmData

import com.example.recyclerviewexample.databinding.ListItemBinding

class filmAdapter(var list:List<FilmData>) : RecyclerView.Adapter<filmAdapter.filmViewHolder>() {

//    private lateinit var binding: ListItemBinding

    inner class filmViewHolder( val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): filmViewHolder {
        val view = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return filmViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: filmViewHolder, position: Int) {
        with(holder){
            with(list[position]){
                binding.imgfilm.setImageResource(this.image)
                binding.tenfilm.text = this.tenfilm
                binding.motafilm.text = this.mota
            }
        }
    }
}