package com.example.registrodeestudiante

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var etEdad: EditText
    private lateinit var btnRegistrar: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        etEdad = findViewById(R.id.etEdad)
        btnRegistrar = findViewById(R.id.btnRegistrar)
        tvResultado = findViewById(R.id.tvResultado)

        btnRegistrar.setOnClickListener {

            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val edad = etEdad.text.toString()

            if (nombre.isEmpty() || apellidos.isEmpty() || edad.isEmpty()) {
                tvResultado.text = "Por favor complete todos los campos"
            } else {
                tvResultado.text = """
                    Estudiante registrado:
                    Nombre: $nombre
                    Apellidos: $apellidos
                    Edad: $edad
                """.trimIndent()
            }
        }
    }
}