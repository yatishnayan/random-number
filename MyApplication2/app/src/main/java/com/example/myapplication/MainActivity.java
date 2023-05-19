package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.Toast_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t =(TextView) findViewById(R.id.myTextView);
                t.setText("changed text");
                t.setTextColor(Color.rgb(255,0,0));
                Toast.makeText(MainActivity.this, "yooooo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}