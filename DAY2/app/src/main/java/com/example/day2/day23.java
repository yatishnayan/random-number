package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class day23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day23);

        TextView name = findViewById(R.id.textView2);
        String n = getIntent().getStringExtra("name");
        name.setText(n);
    }
}