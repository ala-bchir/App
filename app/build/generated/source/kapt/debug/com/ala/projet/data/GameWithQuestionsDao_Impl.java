package com.ala.projet.data;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GameWithQuestionsDao_Impl implements GameWithQuestionsDao {
  private final RoomDatabase __db;

  public GameWithQuestionsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<GameWithQuestions> getGamesWithQuestions() {
    final String _sql = "SELECT * FROM game";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final LongSparseArray<ArrayList<Question>> _collectionQuestions = new LongSparseArray<ArrayList<Question>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey;
          _tmpKey = _cursor.getLong(_cursorIndexOfId);
          if (!_collectionQuestions.containsKey(_tmpKey)) {
            _collectionQuestions.put(_tmpKey, new ArrayList<Question>());
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipQuestionAscomAlaProjetDataQuestion(_collectionQuestions);
        final List<GameWithQuestions> _result = new ArrayList<GameWithQuestions>(_cursor.getCount());
        while (_cursor.moveToNext()) {
          final GameWithQuestions _item;
          final Game _tmpGame;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          _tmpGame = new Game(_tmpId,_tmpName);
          final ArrayList<Question> _tmpQuestionsCollection;
          final long _tmpKey_1;
          _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
          _tmpQuestionsCollection = _collectionQuestions.get(_tmpKey_1);
          _item = new GameWithQuestions(_tmpGame,_tmpQuestionsCollection);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipQuestionAscomAlaProjetDataQuestion(
      @NonNull final LongSparseArray<ArrayList<Question>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchLongSparseArray(_map, true, (map) -> {
        __fetchRelationshipQuestionAscomAlaProjetDataQuestion(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `gameId`,`question`,`response`,`dateAdded`,`status`,`id` FROM `Question` WHERE `gameId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      final long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "gameId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfGameId = 0;
      final int _cursorIndexOfQuestion = 1;
      final int _cursorIndexOfResponse = 2;
      final int _cursorIndexOfDateAdded = 3;
      final int _cursorIndexOfStatus = 4;
      final int _cursorIndexOfId = 5;
      while (_cursor.moveToNext()) {
        final long _tmpKey;
        _tmpKey = _cursor.getLong(_itemKeyIndex);
        final ArrayList<Question> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Question _item_1;
          final long _tmpGameId;
          _tmpGameId = _cursor.getLong(_cursorIndexOfGameId);
          final String _tmpQuestion;
          if (_cursor.isNull(_cursorIndexOfQuestion)) {
            _tmpQuestion = null;
          } else {
            _tmpQuestion = _cursor.getString(_cursorIndexOfQuestion);
          }
          final String _tmpResponse;
          if (_cursor.isNull(_cursorIndexOfResponse)) {
            _tmpResponse = null;
          } else {
            _tmpResponse = _cursor.getString(_cursorIndexOfResponse);
          }
          final long _tmpDateAdded;
          _tmpDateAdded = _cursor.getLong(_cursorIndexOfDateAdded);
          final int _tmpStatus;
          _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          _item_1 = new Question(_tmpGameId,_tmpQuestion,_tmpResponse,_tmpDateAdded,_tmpStatus,_tmpId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
