package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Problem6Activity extends AppCompatActivity {
    EditText num1, num2, num3, num4, num5;
    TextView result;
    Button totalbtn, avaregebtn, percentgebtn;
    float eng, phy, chem, math, comp;
    float total, average, percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem6);

        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        num3 = findViewById(R.id.et_three_id);
        num4 = findViewById(R.id.et_four_id);
        num5 = findViewById(R.id.et_five_id);
        result = findViewById(R.id.result_tv);
        totalbtn = findViewById(R.id.total_btn_id);
        avaregebtn = findViewById(R.id.avarece_btn_id);
        percentgebtn = findViewById(R.id.percent_btn_id);


        totalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                String two = num2.getText().toString();
                String three = num3.getText().toString();
                String four = num4.getText().toString();
                String five = num5.getText().toString();
                //String two = num2.getText().toString();

                eng = Float.parseFloat(one);
                phy = Float.parseFloat(two);
                math = Float.parseFloat(three);
                comp = Float.parseFloat(four);
                chem = Float.parseFloat(five);

                total = eng + phy + chem + math + comp;



                result.setText("Total : \n" + total + "  ");


            }
        });
        avaregebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                String two = num2.getText().toString();
                String three = num3.getText().toString();
                String four = num4.getText().toString();
                String five = num5.getText().toString();
                //String two = num2.getText().toString();

                eng = Float.parseFloat(one);
                phy = Float.parseFloat(two);
                math = Float.parseFloat(three);
                comp = Float.parseFloat(four);
                chem = Float.parseFloat(five);

                average = (float) (total / 5);



                result.setText("Average : \n" + average + "  ");


            }
        });
        percentgebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();
                String two = num2.getText().toString();
                String three = num3.getText().toString();
                String four = num4.getText().toString();
                String five = num5.getText().toString();
                //String two = num2.getText().toString();

                eng = Float.parseFloat(one);
                phy = Float.parseFloat(two);
                math = Float.parseFloat(three);
                comp = Float.parseFloat(four);
                chem = Float.parseFloat(five);

                percentage = (float) ((total / 500.00) * 100);


                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                float twoDigitsF = Float.valueOf(decimalFormat.format(percentage));


                result.setText("Percentage : \n" + twoDigitsF + "  ");


            }
        });


    }
}
