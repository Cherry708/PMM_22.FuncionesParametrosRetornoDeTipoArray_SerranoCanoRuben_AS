package com.example.pmm_21arraysconceptos_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val integerArray = arrayOf(7,3,4,3)

        val tvResult = findViewById<TextView>(R.id.tvResult40)
        val result = "El elemento más pequeño es: ${lesserValue(integerArray)} y se repite: ${valueCount(integerArray, lesserValue(integerArray))} veces"

        tvResult.text = result
    }

    fun lesserValue(array: Array<Int>): Int{
        var min = array[0]
        for (e in array.indices){
            if (array[e] < min){
                min = array[e]
            }
        }
        return min
    }

    fun valueCount(array: Array<Int>, min:Int): Int{
        var counter = 0
        for (e in array.indices){
            if (array[e] == min){
                counter++
            }
        }
        return counter
    }
}