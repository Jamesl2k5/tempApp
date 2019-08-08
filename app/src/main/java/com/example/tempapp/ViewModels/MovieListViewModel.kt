package com.example.tempapp.ViewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tempapp.Models.MovieModel

class MovieListViewModel : ViewModel() {
    var movieModelList : MutableLiveData<Array<MovieModel>>? = null

    fun getMovieList(){

    }

    override fun onCleared() {
        super.onCleared()
        movieModelList = null
    }
}