package com.example.club

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SetKlik : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_klik)

        val club = intent.getParcelableExtra<DataClub>("club")
        if (club != null){
            val hasil : TextView = findViewById(R.id.result)

            hasil.text = club.nama

        }
    }
}