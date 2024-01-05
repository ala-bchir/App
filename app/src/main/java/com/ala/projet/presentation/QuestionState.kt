package com.ala.projet.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.ala.projet.data.Question

data class QuestionState(

    val questions: List<Question> = emptyList(),
    val question: MutableState<String> = mutableStateOf(""),
    val response: MutableState<String> = mutableStateOf("")

)