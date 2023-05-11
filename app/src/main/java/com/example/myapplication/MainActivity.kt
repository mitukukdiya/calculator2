package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var am_calc_et1 : EditText
    lateinit var am_calc_et2 : EditText
    lateinit var am_cal_add  : Button
    lateinit var am_calc_sub : Button
    lateinit var am_calc_div : Button
    lateinit var am_calc_mul : Button
    lateinit var am_calc_answer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        am_calc_et1 = findViewById(R.id.am_cal_et1)
        am_calc_et2 = findViewById(R.id.am_cal_et2)
        am_cal_add = findViewById(R.id.am_cal_add)
        am_calc_sub = findViewById(R.id.am_cal_sub)
        am_calc_div = findViewById(R.id.am_cal_div)
        am_calc_mul = findViewById(R.id.am_cal_mul)
        am_calc_answer = findViewById(R.id.am_calc_answer)


        am_cal_add.setOnClickListener {
            var a = Integer.parseInt(am_calc_et1.text.toString())
            var b = Integer.parseInt(am_calc_et2.text.toString())
            var c = a + b
            am_calc_answer.text = c.toString()
        }
        am_calc_sub.setOnClickListener {
            var a = Integer.parseInt(am_calc_et1.text.toString())
            var b = Integer.parseInt(am_calc_et2.text.toString())
            var c = a - b
            am_calc_answer.text = c.toString()
        }
        am_calc_div.setOnClickListener {
            var a = Integer.parseInt(am_calc_et1.text.toString())
            var b = Integer.parseInt(am_calc_et2.text.toString())
            var c = a / b
            am_calc_answer.text = c.toString()
        }
        am_calc_mul.setOnClickListener {
            var a = Integer.parseInt(am_calc_et1.text.toString())
            var b = Integer.parseInt(am_calc_et2.text.toString())
            var c = a * b
            am_calc_answer.text = c.toString()
        }
    }
}