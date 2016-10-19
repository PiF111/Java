package com.example.andre.laba6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8;
    EditText e1, e2, e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);

        b1.setOnClickListener(plus);
        b2.setOnClickListener(minus);
        b3.setOnClickListener(um);
        b4.setOnClickListener(del);
        b5.setOnClickListener(XmodY);
        b6.setOnClickListener(XxorY);
        b7.setOnClickListener(bin);
        b8.setOnClickListener(inX);
    }
    View.OnClickListener plus = new View.OnClickListener() {
        public void onClick(View v) {
            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());
            String result = Double.toString(x+y);
            e3.setText(result);
        }
    };

    View.OnClickListener minus = new View.OnClickListener() {
        public void onClick(View v) {
            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());
            String result = Double.toString(x-y);
            e3.setText(result);
        }
    };

    View.OnClickListener um = new View.OnClickListener() {
        public void onClick(View v) {
            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());
            String result = Double.toString(x*y);
            e3.setText(result);
        }
    };

    View.OnClickListener del = new View.OnClickListener() {
        public void onClick(View v) {
            double x = Double.parseDouble(e1.getText().toString());
            double y = Double.parseDouble(e2.getText().toString());
            String result = Double.toString(x/y);
            e3.setText(result);
        }
    };

    View.OnClickListener XmodY = new View.OnClickListener() {
        public void onClick(View v) {
            int X = Integer.parseInt(e1.getText().toString());
            int Y = Integer.parseInt(e2.getText().toString());
            int Res = X % Y;
            String result = Integer.toString(Res);
            e3.setText(result);
        }
    };

    View.OnClickListener XxorY = new View.OnClickListener() {
        public void onClick(View v) {
            int X = Integer.parseInt(e1.getText().toString());
            int Y = Integer.parseInt(e2.getText().toString());
            int Res = X^Y;
            String result = Integer.toString(Res);
            e3.setText(result);
        }
    };

    View.OnClickListener bin = new View.OnClickListener() {
        public void onClick(View v) {
            int X=Integer.parseInt(e1.getText().toString());
            String s = Integer.toBinaryString(X);
            e3.setText(s);
        }
    };

    View.OnClickListener inX = new View.OnClickListener() {
        public void onClick(View v) {
            e1.setText(e3.getText().toString());
        }
    };
}


