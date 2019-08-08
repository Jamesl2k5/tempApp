package com.example.tempapp.Models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieModel(
    @SerializedName("poster_path")
    var posterPath: String?,

    @SerializedName("adult")
    var adultContent: Boolean,

    @SerializedName("overview")
    var overviewText: String,

    @SerializedName("release_date")
    var releaseDate: String,

    @SerializedName("genre_ids")
    var genreIDs: Array<Int>,

    @SerializedName("id")
    var movieID: Int,

    @SerializedName("original_title")
    var titleOriginal: String,

    @SerializedName("original_language")
    var languageOriginal: String,

    @SerializedName("title")
    var titleCurrent: String,

    @SerializedName("backdrop_path")
    var backdropPath: String?,

    @SerializedName("popularity")
    var popularity: Float,

    @SerializedName("vote_count")
    var voteCount: Int,

    @SerializedName("video")
    var videoContent: Boolean,

    @SerializedName("vote_average")
    var voteAverage: Float
) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MovieModel

        if (posterPath != other.posterPath) return false
        if (adultContent != other.adultContent) return false
        if (overviewText != other.overviewText) return false
        if (releaseDate != other.releaseDate) return false
        if (!genreIDs.contentEquals(other.genreIDs)) return false
        if (movieID != other.movieID) return false
        if (titleOriginal != other.titleOriginal) return false
        if (languageOriginal != other.languageOriginal) return false
        if (titleCurrent != other.titleCurrent) return false
        if (backdropPath != other.backdropPath) return false
        if (popularity != other.popularity) return false
        if (voteCount != other.voteCount) return false
        if (videoContent != other.videoContent) return false
        if (voteAverage != other.voteAverage) return false

        return true
    }

    override fun hashCode(): Int {
        var result = posterPath?.hashCode() ?: 0
        result = 31 * result + adultContent.hashCode()
        result = 31 * result + overviewText.hashCode()
        result = 31 * result + releaseDate.hashCode()
        result = 31 * result + genreIDs.contentHashCode()
        result = 31 * result + movieID
        result = 31 * result + titleOriginal.hashCode()
        result = 31 * result + languageOriginal.hashCode()
        result = 31 * result + titleCurrent.hashCode()
        result = 31 * result + (backdropPath?.hashCode() ?: 0)
        result = 31 * result + popularity.hashCode()
        result = 31 * result + voteCount
        result = 31 * result + videoContent.hashCode()
        result = 31 * result + voteAverage.hashCode()
        return result
    }
}
