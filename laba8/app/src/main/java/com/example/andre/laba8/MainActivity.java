package com.example.andre.laba8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnTouchListener {

    TextView t1;
    float x,y;
    String sDown,sMove,sUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView1);
        t1.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();   // текущая координата X пальца
        y = event.getY();   // текущая координата Y пальца

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // нажатие
                sDown = "Down: " + x + "," + y;
                sMove = ""; sUp = "";
                // здесь делаем что-то, чтобы обработать событие нажатия
                break;
            case MotionEvent.ACTION_MOVE: // движение
                sMove = "Move: " + x + "," + y;
                // здесь обработываем событие перемещения пальца
                break;
            case MotionEvent.ACTION_UP: // отпускание
                sMove = "";
                sUp = "Up: " + x + "," + y;
                // здесь делаем что-то, чтобы обработать событие отпускания
                break;
            case MotionEvent.ACTION_CANCEL:
                // событие отмены
                break;
        }
        t1.setText(sDown + "\n" + sMove + "\n" + sUp);
        // здесь можем вывести нужные надписи на papa
        return true;
    }
}
