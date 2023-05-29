package com.example.dinnertime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodlist=mutableListOf("Indian","Korean","Western","Japanese","Thai")
        val n=foodlist.size

        val click:Button=findViewById(R.id.decide)
        click.setOnClickListener{
            val random_food=(0..n).shuffled().first()
            val setfood: TextView =findViewById(R.id.selected_food)
            setfood.text= foodlist[random_food]
        }
        val addfood:Button=findViewById(R.id.add)
        addfood.setOnClickListener{
            val item: TextView = findViewById(R.id.addFood)
            val newFood = item.text.toString()
            foodlist.add(newFood)
        }

    }
}