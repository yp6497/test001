package com.example.test001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int count2 = 0;
    int count3 = 0;
    TextView N1, N2, tPer, TorF;
    int n1, n2;
    Button btnP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnP = findViewById(R.id.btnP);
        N1 = findViewById(R.id.textView3);
        N2 = findViewById(R.id.textView4);
        tPer = findViewById(R.id.tPer);
        TorF = findViewById(R.id.TorF);
    }

    public void PressForNum(View view) {
        count2++;
        count = 0;
        n1 = (int) (Math.random() * 10 + 0);
        n2 = (int) (Math.random() * 10 + 0);
        N1.setText(n1 + "");
        N2.setText(n2 + "");
        TorF.setText("True/False");
    }

    public void clear(View view) {
        count2 = 0;
        count3 = 0;
        tPer.setText("0/0");
    }

    public void numbersAreE(View view) {
        count++;
        if (n1 == n2) {
            TorF.setText("true");
            if (count == 1)
                count3++;
        } else TorF.setText("false");
        tPer.setText(count3 + "/" + count2);


    }

    public void number2Isbigger(View view) {
        count++;
        if (n1 < n2) {
            TorF.setText("true");
            if (count == 1)
                count3++;
        } else TorF.setText("false");
        tPer.setText(count3 + "/" + count2);


    }

    public void number1Isbigger(View view) {
        count++;
        if (n1 > n2) {
            TorF.setText("true");
            if (count == 1)
                count3++;
        } else TorF.setText("false");
        tPer.setText(count3 + "/" + count2);

    }
}
