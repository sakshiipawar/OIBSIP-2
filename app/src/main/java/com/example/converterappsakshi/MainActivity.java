package com.example.converterappsakshi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText enter_number;
    Button miles;
    Button kilometer;
    Button foot;
    Button centimeter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output =findViewById(R.id.output);
        enter_number =findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.miles);
        kilometer =findViewById(R.id.kilometer);

        foot=findViewById(R.id.foot);
        centimeter=findViewById(R.id.centimeter);


        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=enter_number.getText().toString();
                int number=Integer.parseInt(num);
                double foot=(number/0.3048);
                output.setText("value in Foot :"+foot);



            }
        });

        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=enter_number.getText().toString();
                int number=Integer.parseInt(num);
                double centimeter=(number *100);
                output.setText("value in centimeter :"+centimeter);



            }
        });

        kilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=enter_number.getText().toString();
                int number=Integer.parseInt(num);
                double kilometer=(number/1000.00);
                output.setText("value in kilometer :"+kilometer);



            }
        });

        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=enter_number.getText().toString();
                int number=Integer.parseInt(num);
                double miles=(number/ 1.609);
                output.setText("value in miles :"+miles);



            }
        });
    }
}