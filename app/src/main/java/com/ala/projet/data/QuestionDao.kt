package com.ala.projet.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao
interface QuestionDao {

    @Upsert
    suspend fun upsertQuestion(question: Question)

    @Delete
    suspend fun deleteQuestion(question: Question)

    @Query("SELECT * FROM question ORDER BY dateAdded")
    fun getQuestionsOrderdByDateAdded(): Flow<List<Question>>


    @Query("SELECT * FROM question ORDER BY status")
    fun getQuestionsOrderdByStatus(): Flow<List<Question>>
    @Query("SELECT * FROM question WHERE gameId = :gameId")

    fun getQuestionsForGame(gameId: Long): Flow<List<Question>>

    @Query("SELECT * FROM question")
    fun getAllQuestions(): List<Question>

}











