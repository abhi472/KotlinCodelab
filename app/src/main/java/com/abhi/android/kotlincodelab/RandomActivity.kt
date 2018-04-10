package com.abhi.android.kotlincodelab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object {
        const val COUNT = "count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        updateText()
    }

    fun updateText() {
        val count = intent.getIntExtra(COUNT, 0)

        val random = Random()
        var randomInt = 0;
        if(count > 0) {
            randomInt = random.nextInt(count+1)
        }

        random_text.text = Integer.toString(randomInt)
    }


}
