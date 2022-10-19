package com.example.fooddecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.util.toRange
import java.lang.Math.random
import java.util.*

class MainActivity : AppCompatActivity() {

    val arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val tv: TextView = findViewById(R.id.text)
        val input: EditText = findViewById(R.id.textPersonName)
        tv.text = "${input.text}"
    }

    fun clickRandom(view: View) {
        arrayList.add("Hamburger")
        arrayList.add("Pizza")
        arrayList.add("Mexican")
        arrayList.add("American")
        arrayList.add("Chinese")

        val randomIndex: Double = Math.random() *4;

        val food = arrayList[randomIndex.toInt()]
        val tv: TextView = findViewById(R.id.text)
        tv.text = food

    }

}