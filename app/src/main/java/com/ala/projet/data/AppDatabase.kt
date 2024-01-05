package com.ala.projet.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [Game::class,Question::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase(){
    abstract val gameDao: GameDao
    abstract val dao: QuestionDao

    abstract fun gameWithQuestionsDao(): GameWithQuestionsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}