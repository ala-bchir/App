package com.ala.projet.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert


@Dao
interface GameDao {
    @Insert
    suspend fun insertGame(game: Game): Long

    @Delete
    suspend fun deleteGame(game: Game)


}