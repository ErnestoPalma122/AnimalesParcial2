package com.example.animales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun siguente (vista:View){
        val ventana:Intent = Intent(applicationContext,animal_2::class.java)
        startActivity(ventana)
    }
    fun previo (Vista:View){
        val ventana:Intent = Intent(applicationContext,animal_4::class.java)
        startActivity(ventana)
    }
}