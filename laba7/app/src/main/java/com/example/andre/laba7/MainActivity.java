package com.example.andre.laba7;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener  {

    Button b1;
    TextView t1, t2;
    SensorManager misha;
    Sensor sasha;
    float x,y,z,x1,y1,z1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        misha = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sasha=misha.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(nol);
    }
    View.OnClickListener nol = new View.OnClickListener() {
        public void onClick(View v) {
            x1=0;
            y1=0;
            z1=0;

        }
    };
    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }
    @Override
    public final void onSensorChanged(SensorEvent event) {
        x = event.values[0];
        y = event.values[1];
        z = event.values[2];

        t1.setText(String.valueOf(x)+" "+(y)+" "+(z));
        if (x>x1) x1=x; t2.setText(String.valueOf(x1)+" "+(y1)+" "+(z1));
        if (y>y1) y1=y; t2.setText(String.valueOf(x1)+" "+(y1)+" "+(z1));
        if (z>z1) z1=z; t2.setText(String.valueOf(x1)+" "+(y1)+" "+(z1));
        // Many sensors return 3 values, one for each axis.
        // x = event.values[0]; y = event.values[1]; z = event.values[2];
        // Do something with this sensor value.
    }
    @Override
    protected void onResume() {
        super.onResume();
        misha.registerListener(this, sasha, SensorManager.SENSOR_DELAY_NORMAL);
    }

}
