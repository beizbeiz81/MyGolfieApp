package com.howeilongct0289083.mygolfieapp;

//Done by Ho Wei Long CT0289083 DipWT-8

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
// initialize variables
        private TextView time;
        private Button start;
        private Button cancel;
        private CountDownTimer countDownTimer;

        private View.OnClickListener btnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.start :
                        start();
                        break;
                    case R.id.cancel :
                        cancel();
                        break;
                }
            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);
            start = (Button) findViewById(R.id.start);
            start.setOnClickListener(btnClickListener);
            cancel = (Button) findViewById(R.id.cancel);
            cancel.setOnClickListener(btnClickListener);
            time = (TextView) findViewById(R.id.time);
        }

    private void start() {
        time.setText("60");
// setting countdown timer
        countDownTimer = new CountDownTimer(60 * 1000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                time.setText("Done!");
            }
        };

        countDownTimer.start();
    }



    private void cancel() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
            countDownTimer = null;
        }
    }
}

