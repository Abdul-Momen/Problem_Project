package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem3Activity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button meterbtn,kilometerbtn;
    float cm, meter, km;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);

        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        result = findViewById(R.id.result_tv);
        meterbtn = findViewById(R.id.meter_btn_id);
        kilometerbtn = findViewById(R.id.kilometer_btn_id);


        meterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                //String two = num2.getText().toString();

                cm = Float.parseFloat(one);

                meter = (float) (cm / 100.0);

                result.setText("Length in meter:\n " + meter + " m");


            }
        });

        kilometerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();

                cm = Float.parseFloat(one);

                km    = (float) (cm / 100000.0);

                result.setText("Length in kilometer: " + km+" km");


            }
        });


    }
}
