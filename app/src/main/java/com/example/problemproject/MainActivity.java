package com.example.problemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button problemOne = findViewById(R.id.button_problem_1);
        problemOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(MainActivity.this, Problem_one_Activity.class);
                startActivity(one);

            }
        });

        Button problem2 = findViewById(R.id.button_problem_2);
        problem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one2 = new Intent(MainActivity.this, Problem2Activity.class);
                startActivity(one2);

            }
        });

        Button problem3 = findViewById(R.id.button_problem_3);
        problem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one3 = new Intent(MainActivity.this, Problem3Activity.class);
                startActivity(one3);

            }
        });

        Button problem4 = findViewById(R.id.button_problem_4);
        problem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one4 = new Intent(MainActivity.this, Problem4Activity.class);
                startActivity(one4);

            }
        });

        Button problem5 = findViewById(R.id.button_problem_5);
        problem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one5 = new Intent(MainActivity.this, Problem5Activity.class);
                startActivity(one5);

            }
        });

        Button problem6 = findViewById(R.id.button_problem_6);
        problem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one6 = new Intent(MainActivity.this, Problem6Activity.class);
                startActivity(one6);

            }
        });

        Button problem7 = findViewById(R.id.button_problem_7);
        problem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one7 = new Intent(MainActivity.this, Problem7Activity.class);
                startActivity(one7);

            }
        });

        Button problem8 = findViewById(R.id.button_problem_8);
        problem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one8 = new Intent(MainActivity.this, Problem8Activity.class);
                startActivity(one8);

            }
        });


    }
}
