package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class ProfilePage extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        //profile
        ImageButton eventsButton2 = (ImageButton) findViewById(R.id.eventsButton2);
        ImageButton profileButton2 = (ImageButton) findViewById(R.id.profileButton2);
        ImageButton settingsButton2 = (ImageButton) findViewById(R.id.settingsButton2);
        Button Event1 = (Button) findViewById(R.id.Event1);
        Button Event2 = (Button) findViewById(R.id.Event2);
        Button Event3 = (Button) findViewById(R.id.Event3);
        Button Event4 = (Button) findViewById(R.id.Event4);
        Button Event5 = (Button) findViewById(R.id.Event5);
        Button Event6 = (Button) findViewById(R.id.Event6);
        Button Event7 = (Button) findViewById(R.id.Event7);
        Button Event8 = (Button) findViewById(R.id.Event8);
        Button Event9 = (Button) findViewById(R.id.Event9);
        Button Event10 = (Button) findViewById(R.id.Event10);
        ScrollView eventsList = (ScrollView) findViewById(R.id.scrollList);

        profileButton2.setBackgroundColor(Color.rgb(33, 150, 243));

        updateMyEvents(Event1, Event2, Event3, Event4, Event5, Event6, Event7, Event8, Event9, Event10);

        //eventsButton2 click event
        eventsButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePage.this, mainPage.class);
                startActivity(intent);
            }
        });

        //settingsButton2 click event
        settingsButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePage.this, SettingsPage.class);
                startActivity(intent);
            }
        });
    }

    public static void updateMyEvents(Button Event1, Button Event2, Button Event3, Button Event4, Button Event5, Button Event6, Button Event7, Button Event8, Button Event9, Button Event10){
        if(MainActivity.currentUserObj.myEvents.size() >= 1){
            Event1.setVisibility((View.VISIBLE));
            Event1.setClickable(true);
            Event1.setText(MainActivity.currentUserObj.myEvents.get(0).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(0).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 2){
            Event2.setVisibility((View.VISIBLE));
            Event2.setClickable(true);
            Event2.setText(MainActivity.currentUserObj.myEvents.get(1).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(1).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 3){
            Event3.setVisibility((View.VISIBLE));
            Event3.setClickable(true);
            Event3.setText(MainActivity.currentUserObj.myEvents.get(2).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(2).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 4){
            Event4.setVisibility((View.VISIBLE));
            Event4.setClickable(true);
            Event4.setText(MainActivity.currentUserObj.myEvents.get(3).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(3).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 5){
            Event5.setVisibility((View.VISIBLE));
            Event5.setClickable(true);
            Event5.setText(MainActivity.currentUserObj.myEvents.get(4).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(4).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 6){
            Event6.setVisibility((View.VISIBLE));
            Event6.setClickable(true);
            Event6.setText(MainActivity.currentUserObj.myEvents.get(5).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(5).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 7){
            Event7.setVisibility((View.VISIBLE));
            Event7.setClickable(true);
            Event7.setText(MainActivity.currentUserObj.myEvents.get(6).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(6).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 8){
            Event8.setVisibility((View.VISIBLE));
            Event8.setClickable(true);
            Event8.setText(MainActivity.currentUserObj.myEvents.get(7).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(7).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 9){
            Event9.setVisibility((View.VISIBLE));
            Event9.setClickable(true);
            Event9.setText(MainActivity.currentUserObj.myEvents.get(8).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(8).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 10){
            Event10.setVisibility((View.VISIBLE));
            Event10.setClickable(true);
            Event10.setText(MainActivity.currentUserObj.myEvents.get(9).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(9).getEventDescription());
        }
    }
}
