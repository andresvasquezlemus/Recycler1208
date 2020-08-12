package com.example.cicloviadesafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloAdapter: CycloAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Log.d("LOG", SetupCiclovias().init().toString())
       // Log.d("LOG", SetupCiclovias().init1().toString())

        cycloAdapter = CycloAdapter(SetupCiclovias().init() as MutableList<Ciclovia>)
        recyclerView = findViewById(R.id.cyclo_tv)
        recyclerView.layoutManager

    }
}