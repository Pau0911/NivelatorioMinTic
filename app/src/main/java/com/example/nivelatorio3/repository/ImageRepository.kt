package com.example.nivelatorio3.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.nivelatorio3.model.Image
import com.example.nivelatorio3.service.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ImageRepository {

    val serviceImage = MutableLiveData<Image>()


    fun getService(): MutableLiveData<Image> {

        val call = RetrofitClient.apiInterface.getImage()

        call.enqueue(object: Callback<Image> {

            override fun onFailure(call: Call<Image>, t: Throwable) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(call: Call<Image>, response: Response<Image>) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", response.body().toString())
                val data = response.body()
                val msg = data!!.message
                val status= data!!.status
                serviceImage.value = Image(msg,status)

            }
        })

        return serviceImage
    }

}