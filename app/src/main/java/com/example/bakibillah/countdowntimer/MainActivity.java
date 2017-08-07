package com.example.bakibillah.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.timer);
        Timer();
    }

    private  void Timer(){

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long milisecond) {
                txt.setText("Timer is : "+ milisecond / 1000 + "s");

            }

            @Override
            public void onFinish() {

                txt.setText("Timer is finished!");
            }
        }.start();
    }
}
