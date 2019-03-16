package com.example.testefirebasebanco

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM Product")
    fun all(): List<Product>

    @Insert
    fun add(vararg product: Product)
}