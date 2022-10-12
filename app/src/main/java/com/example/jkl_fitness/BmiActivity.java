package com.example.jkl_fitness;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmiActivity extends AppCompatActivity {
    private EditText edit1, edit2;
    private Button btn1;
    private TextView textResult;
    private String height, weight, BMI, result2;
    private double result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        setTitle("비만도 계산기");

        edit1 = findViewById(R.id.heightEditText);
        edit2 = findViewById(R.id.weightEditText);
        btn1 = findViewById(R.id.bmiValue);
        textResult = findViewById(R.id.TextResult);


        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                height = edit1.getText().toString();
                weight = edit2.getText().toString();

                result1 = Double.parseDouble(weight) / ((Double.parseDouble(height) / 100) * (Double.parseDouble(height) / 100));
                if (result1 < 20) {
                    result2 = "저체중";
                } else if (result1 <= 24 && result1 > 20) {
                    result2 = "정상";
                } else if (result1 <= 30 && result1 > 24) {
                    result2 = "과체중";
                } else {
                    result2 = "비만";
                }
                String BMI = String.format("%.2f", result1);
                textResult.setText("귀하의 BMI = " + BMI + "이며, " + result2 + "입니다.");
                return false;

            }
        });


    }
}