package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfilePageAdmin extends Activity {
    public static ArrayList<String> myEvents = new ArrayList<String>();
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_events_page);

        //new_events_page
        ImageButton eventsButton4 = (ImageButton) findViewById(R.id.eventsButton4);
        ImageButton profileButton4 = (ImageButton) findViewById(R.id.profileButton4);
        ImageButton settingsButton4 = (ImageButton) findViewById(R.id.settingsButton4);
        ScrollView eventsList = (ScrollView) findViewById(R.id.scrollList);
        Button adminEvent1 = (Button) findViewById(R.id.Event1);
        Button adminEvent2 = (Button) findViewById(R.id.Event2);
        Button adminEvent3 = (Button) findViewById(R.id.Event3);
        Button adminEvent4 = (Button) findViewById(R.id.Event4);
        Button adminEvent5 = (Button) findViewById(R.id.Event5);
        Button adminEvent6 = (Button) findViewById(R.id.Event6);
        Button adminEvent7 = (Button) findViewById(R.id.Event7);
        Button adminEvent8 = (Button) findViewById(R.id.Event8);
        Button adminEvent9 = (Button) findViewById(R.id.Event9);
        Button adminEvent10 = (Button) findViewById(R.id.Event10);
        ImageButton addEventButton = (ImageButton) findViewById(R.id.addEventButton);
        TextView addEventText = (TextView) findViewById(R.id.addEventText);
        TextView noEventsText = (TextView) findViewById(R.id.noEventsTextAdmin);

        profileButton4.setBackgroundColor(Color.rgb(33, 150, 243));

        if(MainActivity.currentUserObj.myEvents.size() >= 1){
            noEventsText.setVisibility(View.INVISIBLE);
        }

        //eventsButton4 click event
        eventsButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePageAdmin.this, mainPage.class);
                startActivity(intent);
            }
        });

        //settingsButton4 click event
        settingsButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePageAdmin.this, SettingsPage.class);
                startActivity(intent);
            }
        });

        //addEventButton click event
        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilePageAdmin.this, CreateEvent.class);
                startActivity(intent);
            }
        });

        updateAdminEvents(adminEvent1, adminEvent2, adminEvent3, adminEvent4, adminEvent5, adminEvent6, adminEvent7, adminEvent8, adminEvent9, adminEvent10);
    }

    public static void updateAdminEvents(Button adminEvent1, Button adminEvent2, Button adminEvent3, Button adminEvent4, Button adminEvent5, Button adminEvent6, Button adminEvent7, Button adminEvent8, Button adminEvent9, Button adminEvent10){
        if(MainActivity.currentUserObj.myEvents.size() >= 1){
            adminEvent1.setVisibility((View.VISIBLE));
            adminEvent1.setClickable(true);
            adminEvent1.setText(MainActivity.currentUserObj.myEvents.get(0).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(0).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 2){
            adminEvent2.setVisibility((View.VISIBLE));
            adminEvent2.setClickable(true);
            adminEvent2.setText(MainActivity.currentUserObj.myEvents.get(1).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(1).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 3){
            adminEvent3.setVisibility((View.VISIBLE));
            adminEvent3.setClickable(true);
            adminEvent3.setText(MainActivity.currentUserObj.myEvents.get(2).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(2).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 4){
            adminEvent4.setVisibility((View.VISIBLE));
            adminEvent4.setClickable(true);
            adminEvent4.setText(MainActivity.currentUserObj.myEvents.get(3).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(3).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(3).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 5){
            adminEvent5.setVisibility((View.VISIBLE));
            adminEvent5.setClickable(true);
            adminEvent5.setText(MainActivity.currentUserObj.myEvents.get(4).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(4).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 6){
            adminEvent6.setVisibility((View.VISIBLE));
            adminEvent6.setClickable(true);
            adminEvent6.setText(MainActivity.currentUserObj.myEvents.get(5).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(5).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 7){
            adminEvent7.setVisibility((View.VISIBLE));
            adminEvent7.setClickable(true);
            adminEvent7.setText(MainActivity.currentUserObj.myEvents.get(6).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(6).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 8){
            adminEvent8.setVisibility((View.VISIBLE));
            adminEvent8.setClickable(true);
            adminEvent8.setText(MainActivity.currentUserObj.myEvents.get(7).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(7).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 9){
            adminEvent9.setVisibility((View.VISIBLE));
            adminEvent9.setClickable(true);
            adminEvent9.setText(MainActivity.currentUserObj.myEvents.get(8).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(8).getEventDescription());
        }
        if(MainActivity.currentUserObj.myEvents.size() >= 10){
            adminEvent10.setVisibility((View.VISIBLE));
            adminEvent10.setClickable(true);
            adminEvent10.setText(MainActivity.currentUserObj.myEvents.get(9).getEventName() + "\n" + MainActivity.currentUserObj.myEvents.get(9).getEventDescription());
        }
    }
}