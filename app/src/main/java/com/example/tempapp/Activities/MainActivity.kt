package com.example.tempapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.tempapp.R
import com.example.tempapp.ViewModels.MovieListViewModel

class MainActivity : AppCompatActivity() {
    val movieListViewModel : MovieListViewModel by lazy { ViewModelProviders.of(this).get(MovieListViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
