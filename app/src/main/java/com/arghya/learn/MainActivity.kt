package com.arghya.learn

import android.animation.ValueAnimator
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //key
    companion object {
        const val KEY = "com.arghya.learn.MainActivity.KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnOrdernow = findViewById<Button>(R.id.btnOrdernow)
        val order1 = findViewById<EditText>(R.id.order1)
        val order2 = findViewById<EditText>(R.id.order2)
        val order3 = findViewById<EditText>(R.id.order3)



        btnOrdernow.setOnClickListener {
            val ordersList =
                "Order 1 = " + order1.text.toString() +
                        "\n Order 2 = " + order2.text.toString() +
                        "\n Order 3 = " + order3.text.toString()


            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersList)
            startActivity(intent)
        }


    }


}