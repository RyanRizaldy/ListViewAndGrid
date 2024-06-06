package com.example.listviewandgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        val itemList = listOf(
            ItemList.ItemLists(
                "judul1", "deskripsi1",
                "https://static01.nyt.com/images/2021/02/17/dining/17tootired-grilled-cheese/17tootired-grilled-cheese-jumbo.jpg?quality=75&auto=webp"
            ),
            ItemList.ItemLists(
                "judul2", "deskripsi2",
                "https://static01.nyt.com/images/2021/02/28/dining/ch-pasta-alla-vodka/merlin_145792752_fabec26c-908c-4f71-8c84-2b145849da43-jumbo.jpg?quality=75&auto=webp"
            ),
            ItemList.ItemLists(
                "judul3", "deskripsi3",
                "https://static01.nyt.com/images/2021/02/17/dining/17tootired-grain-bowl/17tootired-grain-bowl-jumbo.jpg?quality=75&auto=webp"
            )
        )
        val adapter = Adapter(itemList)
        recyclerView.adapter = adapter
    }
    }