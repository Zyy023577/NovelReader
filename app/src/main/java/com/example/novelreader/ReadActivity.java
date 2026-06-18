package com.example.novelreader;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReadActivity extends AppCompatActivity {

    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        txtContent = findViewById(R.id.txtContent);

        String title =
                getIntent().getStringExtra("title");

        txtContent.setText(
                "正在阅读：《" + title + "》\n\n" +
                        "这里以后显示小说内容。"
        );
    }
}