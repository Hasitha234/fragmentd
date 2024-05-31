package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val homeFragement = HomeFragement()
    val settingFragment = SettingFragment()

    val button:Button= findViewById(R.id.button)
    val button2:Button=findViewById(R.id.button2)

    button.setOnClickListner{

    }

    button2.setOnClickListner{

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}