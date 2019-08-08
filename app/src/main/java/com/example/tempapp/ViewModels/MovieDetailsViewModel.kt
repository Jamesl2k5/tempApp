package com.example.tempapp.ViewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tempapp.Models.MovieModel

class MovieDetailsViewModel : ViewModel() {
    var movieModel : MutableLiveData<MovieModel>? = null

    override fun onCleared() {
        super.onCleared()
        movieModel = null
    }
}