package com.example.pablo384.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_botones_basico.*

class botones_basico : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones_basico)

        button.setOnClickListener { Toast.makeText(this,"Boton Simple", Toast.LENGTH_SHORT).show() }
        toggleB.setOnClickListener { Toast.makeText(this,"Toggle", Toast.LENGTH_SHORT).show() }
        swirch.setOnClickListener { Toast.makeText(this,"Switch", Toast.LENGTH_SHORT).show() }
        imgButton.setOnClickListener { Toast.makeText(this,"Boton Imagen", Toast.LENGTH_SHORT).show() }
        floatingActionButton2.setOnClickListener { Toast.makeText(this,"Boton FLotante", Toast.LENGTH_SHORT).show() }

    }
}
