package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Problem4Activity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button farnetheitbtn;
    float celsius, fahrenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);

        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        result = findViewById(R.id.result_tv);
        farnetheitbtn = findViewById(R.id.faherheit_btn_id);


        farnetheitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                //String two = num2.getText().toString();

                celsius = Float.parseFloat(one);

                fahrenheit = (celsius * 9 / 5) + 32;
                ///two digit float number
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                float twoDigitsF = Float.valueOf(decimalFormat.format(fahrenheit));

                result.setText("Temperature in Fahrenheit:\n " + twoDigitsF + "  F");


            }
        });

    }
}
