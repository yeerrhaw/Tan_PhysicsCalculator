package com.example.tan_physicscalculator_2.Area;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tan_physicscalculator_2.R;

public class Rhombus extends AppCompatActivity implements View.OnClickListener {

        EditText txt_length, txt_width;
        double var1, var2, ans;
        TextView txt_answer;
        Button btn_calc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);

        txt_length = findViewById(R.id.var1);
        txt_width = findViewById(R.id.var2);
        txt_answer = findViewById(R.id.answer);
        btn_calc = findViewById(R.id.calc);
        btn_calc.setOnClickListener(this);





    }
    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txt_length.getText().toString());
        var2 = Double.parseDouble(txt_width.getText().toString());
        ans = 0.5* var1 * var2;
        txt_answer.setText("Answer " + ans);
    }



    }

