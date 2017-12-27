package com.example.android.newyearquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.android.newyearquiz.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method calls NY Quiz Activity
    public void openNYQuiz(View view) {
        Intent openNYQuiz = new Intent(this, NewYearQuizActivity.class);
        EditText nameField = (EditText) findViewById(R.id.name);
        String message = nameField.getText().toString().trim();
        openNYQuiz.putExtra(EXTRA_MESSAGE, message);
        startActivity(openNYQuiz);
    }

    // This method calls Emoji Quiz Activity
    public void openEmojiQuiz(View view) {
        Intent openEmojiQuiz = new Intent(this, EmojiActivity.class);
        EditText nameField = (EditText) findViewById(R.id.name);
        String message = nameField.getText().toString().trim();
        openEmojiQuiz.putExtra(EXTRA_MESSAGE, message);
        startActivity(openEmojiQuiz);
    }

    // This method calls Inventions Quiz Activity
    public void openInventionsQuiz(View view) {
        Intent openInventionsQuiz = new Intent(this, InventionsActivity.class);
        EditText nameField = (EditText) findViewById(R.id.name);
        String message = nameField.getText().toString().trim();
        openInventionsQuiz.putExtra(EXTRA_MESSAGE, message);
        startActivity(openInventionsQuiz);
    }
}