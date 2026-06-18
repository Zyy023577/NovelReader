package com.example.novelreader;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btnAddBook;

    List<Book> books;

    BookAdapter adapter;

    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =
                findViewById(R.id.recyclerViewBooks);

        btnAddBook =
                findViewById(R.id.btnAddBook);

        db = Room.databaseBuilder(
                        getApplicationContext(),
                        AppDatabase.class,
                        "novel_db"
                )
                .allowMainThreadQueries()
                .build();

        books = new ArrayList<>(
                db.bookDao().getAllBooks()
        );

        adapter = new BookAdapter(books);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

        btnAddBook.setOnClickListener(v -> showAddDialog());
    }

    private void showAddDialog() {

        TextInputEditText editText =
                new TextInputEditText(this);

        new AlertDialog.Builder(this)
                .setTitle("添加小说")
                .setView(editText)

                .setPositiveButton("确定",
                        (dialog, which) -> {

                            String title =
                                    editText.getText().toString();

                            if (!title.isEmpty()) {

                                Book book =
                                        new Book(title);

                                db.bookDao().insert(book);

                                books.clear();

                                books.addAll(
                                        db.bookDao()
                                                .getAllBooks()
                                );

                                adapter.notifyDataSetChanged();
                            }
                        })

                .setNegativeButton("取消", null)

                .show();
    }
}