package com.example.tempapp.Models

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MovieListResponseModel(
    @SerializedName("total_results")
    var totalResults: Int,
    @SerializedName("total_pages")
    var totalPages: Int,
    @SerializedName("page")
    var pageNum: Int,
    @SerializedName("results")
    var movieList: Array<MovieModel>
) : Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MovieListResponseModel

        if (totalResults != other.totalResults) return false
        if (totalPages != other.totalPages) return false
        if (pageNum != other.pageNum) return false
        if (!movieList.contentEquals(other.movieList)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = totalResults
        result = 31 * result + totalPages
        result = 31 * result + pageNum
        result = 31 * result + movieList.contentHashCode()
        return result
    }
}