package com.ala.projet.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\nH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/ala/projet/data/QuestionDao;", "", "deleteQuestion", "", "question", "Lcom/ala/projet/data/Question;", "(Lcom/ala/projet/data/Question;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllQuestions", "", "getQuestionsForGame", "Lkotlinx/coroutines/flow/Flow;", "gameId", "", "getQuestionsOrderdByDateAdded", "getQuestionsOrderdByStatus", "upsertQuestion", "app_debug"})
public abstract interface QuestionDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Upsert
    public abstract java.lang.Object upsertQuestion(@org.jetbrains.annotations.NotNull
    com.ala.projet.data.Question question, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteQuestion(@org.jetbrains.annotations.NotNull
    com.ala.projet.data.Question question, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM question ORDER BY dateAdded")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ala.projet.data.Question>> getQuestionsOrderdByDateAdded();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM question ORDER BY status")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ala.projet.data.Question>> getQuestionsOrderdByStatus();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM question WHERE gameId = :gameId")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ala.projet.data.Question>> getQuestionsForGame(long gameId);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM question")
    public abstract java.util.List<com.ala.projet.data.Question> getAllQuestions();
}