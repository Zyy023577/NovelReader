package com.example.novelreader;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {Book.class},
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase
        extends RoomDatabase {

    public abstract BookDao bookDao();
}