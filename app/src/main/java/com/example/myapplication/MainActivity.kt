package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var txv: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv=this.findViewById(R.id.ans1)

        val button1: Button = findViewById(R.id.btn1)
        button1.setOnClickListener {
            txv.setText("顏愷升")
        }
        val button2: Button = findViewById(R.id.btn2)
        button2.setOnClickListener {
            txv.setText("資訊管理學系二年級B班")
        }
        val button3: Button = findViewById(R.id.btn3)
        button3.setOnClickListener {
            txv.setText("411025198")
        }
        val button4: Button = findViewById(R.id.btn4)
        button4.setOnClickListener {
            txv.setText("靜宜大學")
        }
    }


}