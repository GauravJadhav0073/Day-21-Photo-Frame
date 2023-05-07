package com.example.day21photoframe

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var currentImg = 0
    lateinit var image : ImageView
    var names = arrayOf("Virat With Anushka","Virat In RCB Jersy","Father of Pakistan","Champion Captain Kohli")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val prev = findViewById<ImageButton>(R.id.imgprev)
        val next = findViewById<ImageButton>(R.id.imgnext)
        val text = findViewById<TextView>(R.id.tv)

        prev.setOnClickListener {
            //following code is for getting current immage
            val idCurrentImageString = "vk${currentImg + 1}"
            //converting string id into integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById<ImageView>(idCurrentImageInt)
            image.alpha = 0f

            currentImg = (4+ currentImg-1)%4

            //following code is going on previous page
            val idCurrentImageToShowString = "vk${currentImg + 1}"
            //converting string id into integer address associated with it
            val idCurrentImageToShowInt = this.resources.getIdentifier(idCurrentImageToShowString,"id",packageName)
            image = findViewById(idCurrentImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImg]
        }

        next.setOnClickListener {
            //following code is for getting current immage
            val idCurrentImageString = "vk${currentImg + 1}"
            //converting string id into integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById<ImageView>(idCurrentImageInt)
            image.alpha = 0f

            currentImg = (4+ currentImg+1)%4

            //following code is going on previous page
            val idCurrentImageToShowString = "vk${currentImg + 1}"
            //converting string id into integer address associated with it
            val idCurrentImageToShowInt = this.resources.getIdentifier(idCurrentImageToShowString,"id",packageName)
            image = findViewById(idCurrentImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImg]
        }
    }
}