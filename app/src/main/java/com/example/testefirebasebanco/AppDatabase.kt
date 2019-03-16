package com.example.testefirebasebanco

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Product::class), version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun productDao():ProductDao

}