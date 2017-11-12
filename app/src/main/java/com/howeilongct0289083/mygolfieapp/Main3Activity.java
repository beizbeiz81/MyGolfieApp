package com.howeilongct0289083.mygolfieapp;

//Done by Ho Wei Long CT0289083 DipWT-8

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final TextView status = (TextView) findViewById(R.id.textViewStatus);
        final EditText editTextWeight = (EditText) findViewById(R.id.Weight);
        final EditText editTextHeight = (EditText) findViewById(R.id.Height);
        Button button = (Button) findViewById(R.id.buttonCheck);

        final MediaPlayer soundObese = MediaPlayer.create(this, R.raw.obese);
        final MediaPlayer soundOverweight = MediaPlayer.create(this, R.raw.overweight);
        final MediaPlayer soundNormalweight = MediaPlayer.create(this, R.raw.normal);
        final MediaPlayer soundUnderweight = MediaPlayer.create(this, R.raw.underweight);
//initialise variables
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(editTextWeight.getText().toString());
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double bmi = weight / (height * height);

                String statusText;
                int statusColor;
//setting different bmi constraints for different levels
                if (bmi > 27.5) {
                    statusText = "Your Golf BMI Is : Obese And Please Stop Playing!!!";
                    statusColor = Color.RED;
                    soundObese.start();
                    Toast.makeText(getApplicationContext(), "obese", Toast.LENGTH_SHORT).show();
                } else if (bmi > 23) {
                    statusText = "Your Golf BMI Is : Your Are Overweight, Try To Cut Some!!!";
                    statusColor = Color.YELLOW;
                    soundOverweight.start();
                } else if (bmi > 18.5) {
                    statusText = "Your Golf BMI Is : You Are Normal Weight, Let's Try The Next Hole!!!";
                    statusColor = Color.GREEN;
                    soundNormalweight.start();
                } else {
                    statusText = "Your Golf BMI Is : Dont't Waste Time,You Are Underweight!!!";
                    statusColor = Color.WHITE;
                    soundUnderweight.start();
                }

                status.setText(statusText);
                status.setBackgroundColor(statusColor);
            }
        });
    }
}