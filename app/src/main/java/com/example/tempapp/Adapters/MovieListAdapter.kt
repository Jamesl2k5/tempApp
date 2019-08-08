package com.example.tempapp.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tempapp.R
import com.example.tempapp.Activities.MovieDetailsActivity
import com.example.tempapp.Constants.*
import com.example.tempapp.Models.MovieModel

import java.util.ArrayList

class MovieListAdapter(private val sourceContext: Context, private val movieList: ArrayList<MovieModel>) :
    RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(sourceContext).inflate(R.layout.adapter_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val toBind = movieList[position]
        holder.setMovieModel(toBind)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private var movieModel: MovieModel? = null

        init {
            itemView.setOnClickListener(this)
        }

        fun setMovieModel(movieModel: MovieModel) {
            this.movieModel = movieModel
        }

        override fun onClick(v: View) {
            val passMovie = Intent(sourceContext, MovieDetailsActivity::class.java)
            passMovie.putExtra(MOVIE_OBJECT, movieModel)
            sourceContext.startActivity(passMovie)
        }
    }
}
