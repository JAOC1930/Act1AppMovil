package com.example.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        saltarVentana()
        CalularEdad()
    }

    fun saltarVentana(){
        val boton2 = findViewById<Button>(R.id.button)
        boton2.setOnClickListener(){
            val saltar: Intent = Intent(this,MainActivity::class.java)
            startActivity(saltar)
        }
    }

    fun CalularEdad(){
        var mensaje = ""
        var edad = 12

        if(edad > 0 && edad < 18){
            mensaje = "usted es menor de edad"
        }else{
            mensaje = "Es mayor edad"
        }
        val tw_02= findViewById<TextView>(R.id.tw_02)
        tw_02.setText(mensaje)
    }
}