package com.example.club

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var clubList : ArrayList<DataClub>
    private lateinit var adapter: adapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        clubList = ArrayList()

        clubList.add(DataClub("Juventus"))
        clubList.add(DataClub("Milan"))
        clubList.add(DataClub("Inter Milan"))
        clubList.add(DataClub("PSG"))
        clubList.add(DataClub("Manchester City"))
        clubList.add(DataClub("Manchester United"))
        clubList.add(DataClub("Liverpool"))
        clubList.add(DataClub("Real Madrid"))

        adapter = adapter(clubList)
        recyclerView.adapter = adapter

        //set klik item
        adapter.itemKlik = {
            val intent = Intent(this, SetKlik::class.java)
            intent.putExtra("club", it)
            startActivity(intent)
        }
    }
}