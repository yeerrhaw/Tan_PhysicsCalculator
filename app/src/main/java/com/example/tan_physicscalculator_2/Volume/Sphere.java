package com.example.tan_physicscalculator_2.Volume;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tan_physicscalculator_2.R;

public class Sphere extends AppCompatActivity implements View.OnClickListener {

    EditText txt_radius;
    double var1, ans;
    TextView txtanswer;
    Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        btnCalc = findViewById(R.id.calc);
        txt_radius = findViewById(R.id.var1);
        txtanswer = findViewById(R.id.ans);
        btnCalc.setOnClickListener(this);





}
    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txt_radius.getText().toString());
        ans = 1.33 * var1 * var1 * var1 * Math.PI;
        txtanswer.setText("The volume of the sphere is " + ans);
    }
    }

