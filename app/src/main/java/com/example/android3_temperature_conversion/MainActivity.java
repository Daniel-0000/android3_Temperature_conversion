package com.example.android3_temperature_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x = 0;
    public void Conversion(View view) {
        DecimalFormat nf = new DecimalFormat("0.00");
        EditText temperature = findViewById(R.id.temperature);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView2);
        double Temperature = Double.parseDouble(temperature.getText().toString());
        if(x == 0){
            Temperature = ((9 * Temperature) / 5) + 32;
            TextView result = (TextView)findViewById(R.id.temperature);
            result.setText(nf.format(Temperature));
            textView3.setText("華氏溫度");
            textView2.setText("F");
            x = 1;
        }

        else {
            if(x == 1){
                Temperature = ((Temperature - 32) * 5) / 9 ;
                TextView result = (TextView)findViewById(R.id.temperature);
                result.setText(nf.format(Temperature));
                textView3.setText("攝氏溫度");
                textView2.setText("C");
                x = 0;
            }

        }


    }


}