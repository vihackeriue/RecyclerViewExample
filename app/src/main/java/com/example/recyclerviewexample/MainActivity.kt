package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.Adapter.filmAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<FilmData>()
        list.add(FilmData(R.drawable.film1,"Film 1 2", "Film Rất hay"))
        list.add(FilmData(R.drawable.film1,"Film 1 3", "Film Rất hay"))
        list.add(FilmData(R.drawable.film1,"Film 1 2", "Film Rất hay"))
        list.add(FilmData(R.drawable.film1,"Film 1 3", "Film Rất hay"))

        val adapter1 = filmAdapter(list)
        binding.filmList.adapter = adapter1
        binding.filmList.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false

        )
    }
}