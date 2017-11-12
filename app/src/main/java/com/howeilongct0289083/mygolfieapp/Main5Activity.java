package com.howeilongct0289083.mygolfieapp;

//Done by Ho Wei Long CT0289083 DipWT-8

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Get ListView object from xml
        final ListView listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                "Hong Kong Seniors Open Amateur Championship 2017",
                "Asia Pacific Golf Team Championship (Nomura Cup)",
                "SGA Junior Golf Day",
                "Faldo Series Singapore Championship 2017",
                "9th Warren-MST Amateur Open",
                "26th SICC/DBS Junior Invitational Golf Championship 2017",
                "HSBC Youth Golf Challenge, 2nd Leg",
                "SGA Fundraising Golf 2017",
                "Hong Kong Open Amateur & Mid-Amateur Championships",
                "Southeast Asia Golf Team Championship for the 56th PUTRA Cup, 10th LION CITY Cup, 8th SANTI Cup and 4th KARTINI Cup",
                "Southeast Asian Games 2017",
                "Hong Kong Junior Open Championship 2017 (Aged 7-10)"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position : "+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}

