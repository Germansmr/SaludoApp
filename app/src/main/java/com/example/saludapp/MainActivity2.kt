package com.example.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Crea una variable tvGreeting y busca un TextView con id "tvGreeting"
        val tvGreeting: TextView = findViewById(R.id.tvGreeting)
        //Obetenemos los extras enviados con clave "EXTRA_NAME" (El ? se utiliza para que en caso de error no muestre el error sino que devolvera null, "orEmpty" en caso de null mostrara una cadena vacia "")
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        //Muestra el mensaje Hola y el nombre introducido
        tvGreeting.text = "Hola $name"

    }
}