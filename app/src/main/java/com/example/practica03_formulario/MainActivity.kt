package com.example.practica03_formulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var botonEnviar: Button = findViewById(R.id.b_enviar)
        botonEnviar.setOnClickListener {
            // la funcion
        }
    }
    fun recopilarDatos(){
        var txtNombre:TextView = findViewById(R.id.txtV_nombre)
        var txtApellido:TextView = findViewById(R.id.txtV_apellido)
        var bg_edad:Button = findViewById(R.id.rbG_agrupaciones)
    }
}