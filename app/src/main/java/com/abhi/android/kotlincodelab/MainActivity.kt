package com.abhi.android.kotlincodelab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView //syntax is as follows : kotlinx.android.synthetic.main.<layout filename>.<id of view>

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Toasted", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
//        val showTimer = findViewById<TextView>(R.id.textView) // for api level >= 26
//        // val showTimer = findViewById(R.id.textView) as TextView // for api level < 26

        val countString = textView.text.toString() // after applying plugins in gradle we don't need above methods


        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()

    }
}
