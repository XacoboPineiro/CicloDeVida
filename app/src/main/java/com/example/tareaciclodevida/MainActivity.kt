package com.example.tareaciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado","Estamos en onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado", "Estamos en onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado", "Estamos en onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Estado", "Estamos en onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Estado", "Estamos en onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Estado", "Estamos en onStop")
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado", "Estamos en onDestroy")
    }
}