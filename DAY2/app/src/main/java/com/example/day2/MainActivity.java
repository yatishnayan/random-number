package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                if(name.length()>0){
                    Intent one = new Intent(MainActivity.this, day23.class);
                    one.putExtra("name",name);
                    startActivity(one);

                }
                else {
                    Toast.makeText(MainActivity.this, "name cannot be empty", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}