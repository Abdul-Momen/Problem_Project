package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Problem_one_Activity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_one_);


        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        result = findViewById(R.id.result_tv);
        submit = findViewById(R.id.submit_btn_id);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                String two = num2.getText().toString();

                int first = Integer.parseInt(one);
                int second = Integer.parseInt(two);
                int total = first + second;


                result.setText("Result: " + total);


            }
        });


    }
}
