package com.example.andre.laba11;

import android.content.Context;
import android.graphics.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends AppCompatActivity implements OnTouchListener {

    private Bitmap oleg;
    private Paint p1;
    private Rect R1, R2, R3, R4;
    private int x, y;
    private int imgX, imgY;
    private int touchX, touchY;
    private boolean flag=false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm = new Desk(this);
        setContentView(mm);
        mm.setOnTouchListener(this);
        setContentView(mm);
        oleg = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
        p1.setColor(Color.BLACK);

        R1 = new Rect(470, 0, 930, 700);
        R2 = new Rect(imgX, imgY, imgX+410, imgY+610);

        R3 = new Rect(300, 900, 600, 1200);
        R4 = new Rect(60, 80, 360, 400);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = (int) event.getX();
        y = (int) event.getY();
        int touchX_,touchY_;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // нажатие
                flag=false;
                if ((x>=imgX&&y>=imgY)&&(x<=imgX+410&&y<=imgY+610)) {
                    touchX = (int) event.getX();
                    touchY = (int) event.getY();
                    flag = true;
                }
                break;
            case MotionEvent.ACTION_MOVE: // движение
                flag=false;
                touchX_ = (int) event.getX();
                touchY_ = (int) event.getY();
                if ((x>=imgX&&y>=imgY)&&(x<=imgX+410&&y<=imgY+610)) {
                    R2 = new Rect(x+(touchX_-touchX), y+(touchY_-touchY), (x+410)+(touchX_-touchX), (y+610)+(touchY_-touchY));
                    R4 = new Rect((x+60)+(touchX_-touchX), (y+80)+(touchY_-touchY), (x+360)+(touchX_-touchX), (y+400)+(touchY_-touchY));
                    mm.invalidate();
                    flag=true;
                }
                break;
            case MotionEvent.ACTION_UP: // отпускание
                if (flag) {
                    flag=false;
                    imgX=x;
                    imgY=y;
                }
                break;
        }
        return true;
    }

    class Desk extends View {

        public Desk(Context context) {
            super(context);
            p1 = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80, 102, 204, 255);
            canvas.drawBitmap(oleg, R1, R2, p1);
            canvas.drawBitmap(oleg, R3, R4, p1);
        }
    }
    Desk mm;
}