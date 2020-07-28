package com.example.averagecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView results;
    Button maths, art, sciences,life_orientation;
    int result_num;
    int number1, number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     num1 = (EditText)findViewById(R.id.num1);
     num2 = (EditText)findViewById(R.id.num2);
     results = (TextView)findViewById(R.id.results);

     maths = (Button)findViewById(R.id.maths);
     art = (Button)findViewById(R.id.art);
     sciences = (Button)findViewById(R.id.sciences);
     life_orientation = (Button)findViewById(R.id.life_orientation);


     maths.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             //Getting a string text and parse it into an interger and get stored in number1 and number2
            number1 = Integer.parseInt(num1.getText().toString());
            number2 = Integer.parseInt(num2.getText().toString());

            result_num  = number1/number2;
            results.setText(String.valueOf(result_num));

         }
     });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting a string text and parse it into an interger and get stored in number1 and number2
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                result_num  = number1/number2;
                results.setText(String.valueOf(result_num));

            }
        });
        sciences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting a string text and parse it into an interger and get stored in number1 and number2
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                result_num  = number1/number2;
                results.setText(String.valueOf(result_num));

            }
        });
        life_orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting a string text and parse it into an interger and get stored in number1 and number2
                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());

                result_num  = number1/number2;
                results.setText(String.valueOf(result_num));

            }
        });


    }
}