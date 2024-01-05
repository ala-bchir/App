package com.ala.projet.data;

import java.lang.System;

@androidx.room.Database(entities = {com.ala.projet.data.Game.class, com.ala.projet.data.Question.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/ala/projet/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/ala/projet/data/QuestionDao;", "getDao", "()Lcom/ala/projet/data/QuestionDao;", "gameDao", "Lcom/ala/projet/data/GameDao;", "getGameDao", "()Lcom/ala/projet/data/GameDao;", "gameWithQuestionsDao", "Lcom/ala/projet/data/GameWithQuestionsDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.ala.projet.data.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.ala.projet.data.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.ala.projet.data.GameDao getGameDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.ala.projet.data.QuestionDao getDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.ala.projet.data.GameWithQuestionsDao gameWithQuestionsDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ala/projet/data/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/ala/projet/data/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ala.projet.data.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}