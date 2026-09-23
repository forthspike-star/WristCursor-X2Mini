package com.wristcursor.app;


import android.app.Activity;

import android.os.Bundle;

import android.hardware.Sensor;

import android.hardware.SensorManager;

import android.widget.TextView;



public class MainActivity extends Activity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);



        TextView text = new TextView(this);



        SensorManager manager =

                (SensorManager)getSystemService(
                SENSOR_SERVICE);



        Sensor gyro =

                manager.getDefaultSensor(
                Sensor.TYPE_GYROSCOPE);



        Sensor accel =

                manager.getDefaultSensor(
                Sensor.TYPE_ACCELEROMETER);



        String result;



        if(gyro != null && accel != null){

            result =
            "WristCursor X2 Mini\n\n"+
            "Android 11 Compatible\n\n"+
            "Gyroscope: OK\n"+
            "Accelerometer: OK";

        }

        else{

            result =
            "Sensor Error";

        }



        text.setText(result);


        text.setTextSize(18);


        setContentView(text);


    }

}
