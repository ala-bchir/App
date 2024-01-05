package com.ala.projet.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Question(
    val gameId: Long,
    val question: String,
    val response: String,
    val dateAdded: Long,
    var status : Int = 1 ,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
