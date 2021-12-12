package com.example.nivelatorio3.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nivelatorio3.model.Image
import com.example.nivelatorio3.repository.ImageRepository

class ImageViewModel: ViewModel() {

    var imageLiveData:MutableLiveData<Image>? = null

    fun getImage(): MutableLiveData<Image>? {
        imageLiveData = ImageRepository.getService()
        return imageLiveData

    }

}