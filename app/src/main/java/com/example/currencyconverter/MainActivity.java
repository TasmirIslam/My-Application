package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {

        EditText userAmountTaka = findViewById(R.id.takaET);
        TextView resultAmount1 = findViewById(R.id.resultTV1);
        TextView resultAmount2 = findViewById(R.id.resultTV2);
        TextView resultAmount3 = findViewById(R.id.resultTV3);
        TextView resultAmount4 = findViewById(R.id.resultTV4);
        TextView resultAmount5 = findViewById(R.id.resultTV5);
        TextView showTaka = findViewById(R.id.showTakaTV);

        String takainString = userAmountTaka.getText().toString();

        Double takainDouble = Double.parseDouble(takainString);

        Double dollar = takainDouble*0.012;
        Double rupi = takainDouble*0.84;
        Double pound = takainDouble*0.0096;
        Double dinar = takainDouble*0.0036;
        Double dirham = takainDouble*0.043;

        String dollarinString = String.valueOf(dollar);
        String rupiimString = String.valueOf(rupi);
        String poundinString = String.valueOf(pound);
        String dinarinString = String.valueOf(dinar);
        String dirhaminString = String.valueOf(dirham);

        resultAmount1.setText(dollarinString);
        resultAmount2.setText(rupiimString);
        resultAmount3.setText(poundinString);
        resultAmount4.setText(dinarinString);
        resultAmount5.setText(dirhaminString);
        showTaka.setText(takainString);
        userAmountTaka.setText(" ");

    }

}
