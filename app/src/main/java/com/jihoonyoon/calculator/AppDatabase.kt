package com.jihoonyoon.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jihoonyoon.calculator.dao.HistoryDao
import com.jihoonyoon.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}