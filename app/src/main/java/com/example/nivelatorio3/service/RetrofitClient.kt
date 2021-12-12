package com.example.nivelatorio3.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Singleton es un patrón de diseño que asegura que una clase tenga solo una instancia y proporciona un punto global de acceso al objeto. El patrón Singleton es particularmente útil para objetos que deben compartirse entre diferentes partes de su aplicación y para recursos que son costosos de crear.

object RetrofitClient {

    const val url = "https://dog.ceo/api/"

    // recuerda el resultado, llamadas posteriores para obtener () simplemente devuelve el resultado recordado.

    val retrofit: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
    }
    val apiInterface: ApiInterface by lazy {
        retrofit
            .build()
            .create(ApiInterface::class.java)
    }

}