package com.ala.projet.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/ala/projet/presentation/QuestionsViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/ala/projet/data/QuestionDao;", "(Lcom/ala/projet/data/QuestionDao;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ala/projet/presentation/QuestionState;", "get_state", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isSortedByDateAdded", "", "questions", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/ala/projet/data/Question;", "state", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/ala/projet/presentation/QuestionsEvent;", "app_debug"})
public final class QuestionsViewModel extends androidx.lifecycle.ViewModel {
    private final com.ala.projet.data.QuestionDao dao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSortedByDateAdded = null;
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.ala.projet.data.Question>> questions;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.ala.projet.presentation.QuestionState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.ala.projet.presentation.QuestionState> state = null;
    
    public QuestionsViewModel(@org.jetbrains.annotations.NotNull
    com.ala.projet.data.QuestionDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.ala.projet.presentation.QuestionState> get_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.ala.projet.presentation.QuestionState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.ala.projet.presentation.QuestionsEvent event) {
    }
}