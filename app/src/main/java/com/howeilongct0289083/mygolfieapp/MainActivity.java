package com.howeilongct0289083.mygolfieapp;

//Done by Ho Wei Long CT0289083 DipWT-8

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
// Directing each buttons to different pages
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = (Button) findViewById(R.id.golfindex);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);

            }
        });

        Button b = (Button) findViewById(R.id.golftimer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);

            }
        });

        Button c = (Button) findViewById(R.id.golfbmi);
        c.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     Intent i = new Intent(MainActivity.this, Main4Activity.class);
                                     startActivity(i);

                                 }
                             });

            Button d = (Button) findViewById(R.id.golfannouncement);
        d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(i);

                }
            });
    }
}
