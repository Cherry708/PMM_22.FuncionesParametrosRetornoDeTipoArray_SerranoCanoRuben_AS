package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import java.lang.IndexOutOfBoundsException

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val etNumber0 = findViewById<EditText>(R.id.etNumber30)
        val tvResult = findViewById<TextView>(R.id.tvResult30)
        val btnEnter = findViewById<Button>(R.id.btnEnter30)
        btnEnter.isVisible = false
        etNumber0.hint = "Introduce n elementos"

        var addition = 0
        var times = 0
        val addArray = findViewById<Button>(R.id.btnAddArray)
        addArray.setOnClickListener {
            val number0 = etNumber0.text.toString().toInt()
            val listaEnteros = makeArray(number0)
            val listaMessage = "La lista es de hasta ${listaEnteros.size} elementos "
            tvResult.text = listaMessage

            btnEnter.isVisible = true
            etNumber0.text.clear()
            etNumber0.hint = "Número a sumar"
            btnEnter.setOnClickListener {
                val integer = etNumber0.text.toString().toInt()
                try {
                    listaEnteros[times] = integer
                    addition += listaEnteros[times]
                } catch (e:IndexOutOfBoundsException){}
                tvResult.text = addition.toString()
                times++
            }
        }
    }


}

fun makeArray(size: Int): IntArray {
    val listaNumeros = IntArray(size)
    return listaNumeros
}
