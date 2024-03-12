package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val irCalculadora = findViewById<Button>(R.id.Iracalculadora)
        val irIMC = findViewById<Button>(R.id.IraIMC)
        reemplazarfragmento(Inicio())

        irCalculadora.setOnClickListener {
            reemplazarfragmento(Calculadora())

        }

        irIMC.setOnClickListener {
            reemplazarfragmento(IndiceMC())

        }
    }

    fun reemplazarfragmento(fragmento: Fragment)
    {
        val manager = supportFragmentManager
        var transaccion = manager.beginTransaction()
        transaccion.replace(R.id.fragmentContainerView2, fragmento)
        transaccion.commit()
    }
}