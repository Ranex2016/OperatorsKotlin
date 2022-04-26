package com.example.operatorskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf(1,2,3,4,5)
        with(list){
            println(list.sum())
            println(list.first())
            println(list.last())
            println(list.last())
            println(list.average())
        }
    }
}