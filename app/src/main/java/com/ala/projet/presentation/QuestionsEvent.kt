package com.ala.projet.presentation

import com.ala.projet.data.Question

sealed interface QuestionsEvent {
    object SortQuestions: QuestionsEvent

    data class DeleteQuestion(val question: Question): QuestionsEvent

    data class SaveQuestion(
        val question: String,
        val response: String
    ): QuestionsEvent
}
