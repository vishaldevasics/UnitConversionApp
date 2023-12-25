package com.maverickallies.unitconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputET;
    TextView outputTV;
    Button convertBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputET = findViewById(R.id.InputETId);
        outputTV = findViewById(R.id.OutputTVId);
        convertBtn = findViewById(R.id.ConvertBtnId);


        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputET.getText().toString();
                double kilo = Double.parseDouble(input);
                outputTV.setText(""+makeConversion(kilo)+" lbs");
            }
        });

    }
    public double makeConversion(double kilos){
        return kilos * 2.20462;
    }
}