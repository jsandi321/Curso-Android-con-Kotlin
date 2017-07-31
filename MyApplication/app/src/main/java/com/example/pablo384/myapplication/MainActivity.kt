package com.example.pablo384.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TextView mitx = (TextView) findViewById(R.id.)

        button_Enviar.setOnClickListener {
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            var dato :String = editText_DatosDeUsuario.text.toString()
            val b : Bundle = Bundle()
            b.putString("dt",dato)
            intent.putExtras(b)
            startActivity(intent)
        }



    }
}
