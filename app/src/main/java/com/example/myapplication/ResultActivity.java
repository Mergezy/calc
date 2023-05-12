package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.result_text_view);

        double result = getIntent().getDoubleExtra("result", 0);
        double secondNumber = getIntent().getDoubleExtra("secondNumber", 0);
        if (secondNumber < 0) {
            resultTextView.setText(String.format("%.2f + (%.2f) = %.2f", result - secondNumber, secondNumber, result));
        } else {
            resultTextView.setText(String.format("%.2f + %.2f = %.2f", result - secondNumber, secondNumber, result));
        }
    }
}
