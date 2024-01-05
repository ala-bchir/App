package com.ala.projet.data

import androidx.room.Embedded
import androidx.room.Relation

data class GameWithQuestions(
    @Embedded val game: Game,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameId"
    )
    val questions: List<Question>
)
