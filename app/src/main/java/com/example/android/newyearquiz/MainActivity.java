package com.example.android.newyearquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNYQuiz(View view) {
        Intent openNYQuiz = new Intent(this, NewYearQuizActivity.class);
        startActivity(openNYQuiz);
    }

    public void openEmojiQuiz(View view) {
        Intent openEmojiQuiz = new Intent(this, EmojiActivity.class);
        startActivity(openEmojiQuiz);
    }
}