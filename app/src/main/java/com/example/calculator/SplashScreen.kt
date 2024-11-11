package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash_screen)
    android.os.Handler(Looper.getMainLooper()).postDelayed({
      val intent = Intent(this, MainActivity::class.java)
      startActivity(intent)
    }, 2000)
  }
}