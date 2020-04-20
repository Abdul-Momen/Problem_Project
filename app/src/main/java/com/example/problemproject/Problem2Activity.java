package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem2Activity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int n1, n2;
    int sum, sub, mult, mod;
    float div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);


        sumbtn = findViewById(R.id.sum_btn_id);
        differencebtn = findViewById(R.id.difference_btn_id);
        productbtn = findViewById(R.id.product_btn_id);
        quotientbtn = findViewById(R.id.quotient_btn_id);
        modulusbtn = findViewById(R.id.modulus_btn_id);


        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);

                sum = n1 + n2;
                result.setText("Result: " + sum);

            }
        });
        differencebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);

                sub = n1 - n2;
                result.setText("Result: " + sub);

            }
        });
        productbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);

                mult = n1 * n2;

                result.setText("Result: " + mult);

            }
        });
        quotientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);


                div = (float)n1 / n2;
                result.setText("Result: " + div);

            }
        });
        modulusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);

                mod = n1 % n2;
                result.setText("Result: " + mod);

            }
        });

    }
}
