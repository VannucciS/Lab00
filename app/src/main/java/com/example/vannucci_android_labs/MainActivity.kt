package com.example.vannucci_android_labs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytext = findViewById<TextView>(R.id.textview)
        val myedit = findViewById<EditText>(R.id.myedittext)
        val mybutton = findViewById<Button>(R.id.button_id)

        mybutton.setOnClickListener {
            val editString = myedit.getText().toString()

            mytext.setText("Your edit text has:" + editString)
    }
    }
}