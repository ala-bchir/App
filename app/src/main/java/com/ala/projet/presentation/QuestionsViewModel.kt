package com.ala.projet.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ala.projet.data.Question
import com.ala.projet.data.QuestionDao
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class QuestionsViewModel(
    private val dao: QuestionDao
) : ViewModel() {

    private val isSortedByDateAdded = MutableStateFlow(true)

    private var questions =
        isSortedByDateAdded.flatMapLatest { sort ->
            if (sort) {
                dao.getQuestionsOrderdByDateAdded()
            } else {
                dao.getQuestionsOrderdByStatus()
            }
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    val _state = MutableStateFlow(QuestionState())
    val state =
        combine(_state, isSortedByDateAdded, questions) { state, isSortedByDateAdded, questions ->
            state.copy(
                questions = questions
            )
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), QuestionState())

    fun onEvent(event: QuestionsEvent) {
        when (event) {
            is QuestionsEvent.DeleteQuestion -> {
                viewModelScope.launch {
                    dao.deleteQuestion(event.question)
                }
            }

            is QuestionsEvent.SaveQuestion -> {
                val question = Question(
                    question = state.value.question.value,
                    response = state.value.response.value,
                    dateAdded = System.currentTimeMillis(),
                    gameId = 0,


                )

                viewModelScope.launch {
                    dao.upsertQuestion(question)
                }

                _state.update {
                    it.copy(
                        question = mutableStateOf(""),
                        response = mutableStateOf("")
                    )
                }
            }

            QuestionsEvent.SortQuestions -> {
                isSortedByDateAdded.value = !isSortedByDateAdded.value
            }
        }
    }

}