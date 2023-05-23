package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.result_text_view);

        int firstNumber = getIntent().getIntExtra("firstNumber", 0);
        int secondNumber = getIntent().getIntExtra("secondNumber", 0);
        int result = firstNumber + secondNumber;

        if (secondNumber < 0) {
            resultTextView.setText(String.format(Locale.getDefault(), "%d + (%d) = %d", firstNumber, secondNumber, result));
        } else {
            resultTextView.setText(String.format(Locale.getDefault(), "%d + %d = %d", firstNumber, secondNumber, result));
        }
    }
}
