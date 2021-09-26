package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = IntArray(3)

        val etNumber0 = findViewById<EditText>(R.id.etNumber10)
        val etNumber1 = findViewById<EditText>(R.id.etNumber11)
        val etNumber2 = findViewById<EditText>(R.id.etNumber12)
        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val btnPrint = findViewById<Button>(R.id.btnPrint10)
        btnPrint.setOnClickListener {
            array[0] = etNumber0.text.toString().toInt()
            array[1] = etNumber1.text.toString().toInt()
            array[2] = etNumber2.text.toString().toInt()

            tvResult.text = array[0].toString().plus(" "+array[1]).plus(" "+array[2])
        }
    }
}
