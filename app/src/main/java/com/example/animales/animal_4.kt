package com.example.animales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class animal_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal4)
    }
    fun siguente (vista: View){
        val ventana: Intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(ventana)
    }
    fun previo (Vista: View){
        val ventana: Intent = Intent(applicationContext,animal_3::class.java)
        startActivity(ventana)
    }
}