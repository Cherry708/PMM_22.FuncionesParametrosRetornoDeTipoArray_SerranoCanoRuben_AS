package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val etNumber0 = findViewById<EditText>(R.id.etNumber20)
        val etNumber1 = findViewById<EditText>(R.id.etNumber21)
        val tvResult = findViewById<TextView>(R.id.tvResult20)

        etNumber1.isVisible = false

        var wageCounter = 0
        var wageAddition = 0
        val btnEnter = findViewById<Button>(R.id.btnEnter20)
        btnEnter.setOnClickListener {

        }
    }
}









