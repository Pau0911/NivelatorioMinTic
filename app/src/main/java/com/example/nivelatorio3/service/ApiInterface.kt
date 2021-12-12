package com.example.nivelatorio3.service

import com.example.nivelatorio3.model.Image
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("breeds/image/random")
    fun getImage(): Call<Image>

}