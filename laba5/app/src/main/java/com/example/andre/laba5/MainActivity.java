package com.example.andre.laba5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 =  (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(obrabotka);
    }

    OnClickListener obrabotka = new OnClickListener() {
        public void onClick(View v) {
            t1.setText("Кнопка была нажата!");
        }
    };
}

