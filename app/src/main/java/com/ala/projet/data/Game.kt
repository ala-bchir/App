package com.ala.projet.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Game(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String
)
