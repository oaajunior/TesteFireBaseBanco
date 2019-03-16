package com.example.testefirebasebanco

import android.accounts.AuthenticatorDescription
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Product (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val description: String,
    val quantity: Int
    )