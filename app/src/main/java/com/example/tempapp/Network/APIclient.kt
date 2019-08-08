package com.example.tempapp.Network

import com.example.tempapp.Constants.APIconstants
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIclient {
    private var client: Retrofit? = null

    fun getClient(): Retrofit? {
        if (client == null) {
            val gson = GsonBuilder()
                .setLenient()
                .create()
            client = Retrofit.Builder()
                .baseUrl(APIconstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
        return client
    }
}
