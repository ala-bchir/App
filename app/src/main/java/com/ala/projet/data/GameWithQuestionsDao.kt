package com.ala.projet.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface GameWithQuestionsDao {
    @Transaction
    @Query("SELECT * FROM game")
    fun getGamesWithQuestions(): List<GameWithQuestions>
}