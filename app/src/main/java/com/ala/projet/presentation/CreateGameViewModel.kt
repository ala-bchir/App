package com.ala.projet.presentation

import androidx.lifecycle.ViewModel
import com.ala.projet.data.Question
import com.ala.projet.data.QuestionDao
import kotlin.properties.Delegates


class CreateGameViewModel(private val dao: QuestionDao) : ViewModel() {

    private val allQuestions: List<Question> by lazy {
        dao.getAllQuestions()
    }

    // Logique pour créer un jeu avec des questions existantes
    fun createGameWithQuestions(selectedQuestions: List<Question>) {
        // Logique pour créer un nouveau jeu avec les questions sélectionnées
        // Assurez-vous de mettre à jour la base de données avec le nouveau jeu
        // Utilisez dao.insertGame(...) pour insérer un nouveau jeu
    }
}
