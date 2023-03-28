package com.example.ca11viewmodellivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.nvmBtn).setOnClickListener {
            startActivity(Intent(this, NoViewModelActivity::class.java))
        }
        findViewById<Button>(R.id.vmBtn).setOnClickListener {
            startActivity(Intent(this, ViewModelActivity::class.java))
        }
        findViewById<Button>(R.id.ldBtn).setOnClickListener {
            startActivity(Intent(this, LiveDataActivity::class.java))
        }
    }
}