package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.first_number_edit_text);
        secondNumberEditText = findViewById(R.id.second_number_edit_text);

        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("firstNumber", firstNumber);
                intent.putExtra("secondNumber", secondNumber);
                startActivity(intent);

            }
        });
    }
}

