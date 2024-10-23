package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        //Creamos un ClickListener que reacciona cuando se pulsa el botón "btnHello"
        btnHello.setOnClickListener{
        //Llama al log y Como "Test" muestra el texto "Boton pulsado"

            /*OPCION 1*/
            //Log.i("Test", "Botón pulsado")


            //Guarda el texto introducido en el campo de texto (como un Scanner) en "etName"
            val etName:AppCompatEditText = findViewById(R.id.etName)
            //Guarda en "name" el .toString de "etName"
            val name = etName.text.toString()
            //Muestra un mensaje "Toast" diciendo "Hola y el nombre introducido

            /*OPCION 2*/
            //Crea y muestra un elemento Toast
            //Toast.makeText(this, "Hola $name!", Toast.LENGTH_LONG).show()

            /*OPCION 3*/
            //Comprueba que el nombre introducido no este vacio
            /*if (name.isNotEmpty()) {
                //Va a mostrar en una "Snackbar" el texto "Hola y el nombre introducido
                Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_SHORT)
                    //Indicamos que el mensaje aparezca anclado a "btnHello"
                    .setAnchorView(btnHello)
                    //Indicamos una accion que queremos que realize en este caso muestra un texto CLOSE y cierra la actividad
                    //Finaliza el programa
                    .setAction("CLOSE") { finishAffinity() }
                    //Borra el contenido del cuadro de texto --> .setAction("CLOSE") { etName.setText(null) }
                    .show()
            }*/

            //Creamos un intent para lanzar la actividad MainActivity
            val intentGA = Intent(this, MainActivity2::class.java)
            //putExtra añadimos un dato nuevo "name" con la clave asociada "EXTRA NAME" que se usara para recuperar el dato en "MainActivity"
            intentGA.putExtra("EXTRA_NAME",name)
            //Iniciamos la Actividad
            startActivity(intentGA)

        }
    }
}