package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Problem7Activity extends AppCompatActivity {
    EditText num1, num2, num3, num4, num5;
    TextView result;
    Button totalbtn, avaregebtn, percentgebtn;
    int days, years, weeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem7);

        num1 = findViewById(R.id.et_one_id);

        result = findViewById(R.id.result_tv);
        totalbtn = findViewById(R.id.year_btn_id);



        totalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = num1.getText().toString();

                //String two = num2.getText().toString();

                days = Integer.parseInt(one);


                years = (days / 365);   // Ignoring leap year
                weeks = (days % 365) / 7;
                days  = days - ((years * 365) + (weeks * 7));


               /* DecimalFormat decimalFormat = new DecimalFormat("#.##");
                float twoDigitsF = Float.valueOf(decimalFormat.format(years));
*/

                result.setText("Year : " + years + ",  "+"Weeks: "+weeks+",  Days: "+days);


            }
        });


    }
}
