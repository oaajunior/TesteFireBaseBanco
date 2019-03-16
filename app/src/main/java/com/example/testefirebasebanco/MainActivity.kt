package com.example.testefirebasebanco

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCadastrarProduto = findViewById<Button>(R.id.buttonCadastrarProduto)

        val database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "armazenar_produto")
            .allowMainThreadQueries()
            .build()

        btnCadastrarProduto.setOnClickListener{

            val productDao = database.productDao()
            productDao.add(Product(1, "grãos", "Arroz Parboilizado", 10))
            val resultado = productDao.all()
            for(item in resultado){
                Log.d("Elementos" , " ${item.name}, ${item.id}, ${item.description}, ${item.quantity} ")
            }
        }
    }
}
