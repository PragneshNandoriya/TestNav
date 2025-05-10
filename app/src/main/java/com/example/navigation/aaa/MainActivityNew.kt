package com.example.navigation.aaa;

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.navigation.R
import com.example.navigation.aaa.PaymentActivity


class MainActivityNew : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_new)
        findViewById<Button>(R.id.btn_java).setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }

        findViewById<Button>(R.id.btn_kotlin).setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
        Log.i("MainActivity", "onCreate: ")
    }

    fun add(){

    }
    fun substract(){

    }
}