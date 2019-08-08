package com.example.tempapp.Network

import com.example.tempapp.Constants.APIconstants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface APIinterface {

    @POST("${APIconstants.DISCOVER_MOVIE}?api_key=${APIconstants.API_KEY}")
    fun popularMoviesPage(
        @Query("page") pageNumber: String
    ): Call<ResponseBody>
}
