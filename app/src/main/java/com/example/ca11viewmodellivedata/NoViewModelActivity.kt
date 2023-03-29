package com.example.ca11viewmodellivedata

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NoViewModelActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_view_model)

        findViewById<TextView>(R.id.tvCount).text = "0"

        var counter = 0

        findViewById<Button>(R.id.bIncNVM).setOnClickListener {
            counter ++
            findViewById<TextView>(R.id.tvCount).text = counter.toString()
        }
    }
}