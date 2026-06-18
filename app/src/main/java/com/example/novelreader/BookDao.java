package com.example.novelreader;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BookDao {

    @Insert
    long insert(Book book);

    @Delete
    void delete(Book book);

    @Query("SELECT * FROM Book")
    List<Book> getAllBooks();
}