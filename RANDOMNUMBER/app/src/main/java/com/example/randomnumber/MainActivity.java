package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        TextView t1 = findViewById(R.id.textView);
                b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r= new Random();
                t1.setText(r.nextInt(2000)+"");

            }
        });

    }
}