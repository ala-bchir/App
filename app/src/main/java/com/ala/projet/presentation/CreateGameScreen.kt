package com.ala.projet.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.ala.projet.data.Question

@Composable
fun CreateGameScreen(
    state: QuestionState,
    navController: NavHostController,
    onEvent: (QuestionsEvent) -> Unit,
    createGameViewModel: CreateGameViewModel = viewModel()
) {
    val selectedQuestions by remember { mutableStateOf(mutableListOf<Question>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Afficher la liste des questions avec des cases à cocher pour la sélection
        QuestionList(
            questions = state.questions, // Utilisez state.questions pour obtenir les questions existantes
            onQuestionSelected = { question ->
                if (selectedQuestions.contains(question)) {
                    selectedQuestions.remove(question)
                } else {
                    selectedQuestions.add(question)
                }
            }
        )

        // Bouton pour créer le jeu avec les questions sélectionnées
        Button(
            onClick = {
                createGameViewModel.createGameWithQuestions(selectedQuestions)
                navController.popBackStack()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Text(text = "Créer le jeu")
        }
    }
}

@Composable
fun QuestionList(
    questions: List<Question>,
    onQuestionSelected: (Question) -> Unit
) {
    LazyColumn {
        itemsIndexed(questions) { index, question ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false, // Vous devez vérifier si la question est dans selectedQuestions
                    onCheckedChange = { isChecked ->
                        onQuestionSelected(question)
                    },
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = question.question)
            }
        }
    }
}
