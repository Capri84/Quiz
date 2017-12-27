package com.example.android.newyearquiz;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.newyearquiz.databinding.ActivityInventionsBinding;

public class InventionsActivity extends AppCompatActivity {
    ActivityInventionsBinding activityInventionsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInventionsBinding = DataBindingUtil.setContentView(this, R.layout.activity_inventions);
        activityInventionsBinding.inventionsQuiz.setText("Привет Data Binding!");
    }
}