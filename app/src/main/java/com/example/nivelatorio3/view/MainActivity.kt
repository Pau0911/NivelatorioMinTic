package com.example.nivelatorio3.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.nivelatorio3.R
import com.example.nivelatorio3.viewModel.ImageViewModel
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var imageViewModel: ImageViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageViewModel= ViewModelProvider(this).get(ImageViewModel::class.java)

        val btnClick= findViewById<Button>(R.id.btnClick)
        val image= findViewById<ImageView>(R.id.image)

        btnClick.setOnClickListener{
            imageViewModel.getImage()?.observe(this, Observer { imagest ->
                Picasso.get().load(imagest.message).into(image);
                val msg = imagest.message
                Log.d("Prue", "onCreate: "+msg)


            })

        }

        }


    }
