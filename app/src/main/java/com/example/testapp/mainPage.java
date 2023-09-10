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

public class mainPage extends Activity {
    public static Events selectedEvent;
    public static boolean hasSignedUp = false;
//    public static int eventNum = 0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        //main_page
        ScrollView eventsList = (ScrollView) findViewById(R.id.scrollList);
        TextView welcomeMessage = (TextView) findViewById(R.id.welcomeText);
        ImageButton eventsButton = (ImageButton) findViewById(R.id.eventsButton);
        ImageButton profileButton = (ImageButton) findViewById(R.id.profileButton);
        ImageButton settingsButton = (ImageButton) findViewById(R.id.settingsButton);
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

        eventsButton.setBackgroundColor(Color.rgb(33, 150, 243));

        welcomeMessage.setText("Welcome " + MainActivity.currUser + ",");
        updateEvents(Event1, Event2, Event3, Event4, Event5, Event6, Event7, Event8, Event9, Event10);

//        if(eventNum == 1){
//            Event1.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 2){
//            Event2.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 3){
//            Event3.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 4){
//            Event4.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 5){
//            Event5.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 6){
//            Event6.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 7){
//            Event7.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 8){
//            Event8.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 9){
//            Event9.setBackgroundColor(Color.GREEN);
//        }
//        if(eventNum == 10){
//            Event10.setBackgroundColor(Color.GREEN);
//        }

        //profileButton click event
        profileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if(MainActivity.currentUserObj.getUserType().equals("Student")) {
                    Intent intent = new Intent(mainPage.this, ProfilePage.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(mainPage.this, ProfilePageAdmin.class);
                    startActivity(intent);
                }
            }
        });

        //settingsButton click event
        settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(mainPage.this, SettingsPage.class);
                startActivity(intent);
            }
        });

        //Event1 click event
        Event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(0);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event2 click event
        Event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(0);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event3 click event
        Event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(2);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event4 click event
        Event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(3);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event5 click event
        Event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(4);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event6 click event
        Event6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(5);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event7 click event
        Event7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(6);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event8 click event
        Event8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(7);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event9 click event
        Event9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(8);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });

        //Event10 click event
        Event10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedEvent = User.theEvents.get(9);
                Intent intent = new Intent(mainPage.this, EventSignUp.class);
                startActivity(intent);
            }
        });
    }

    public static void updateEvents(Button Event1, Button Event2, Button Event3, Button Event4, Button Event5, Button Event6, Button Event7, Button Event8, Button Event9, Button Event10){
        if(User.theEvents.size() >= 1){
            Event1.setVisibility((View.VISIBLE));
            Event1.setClickable(true);
            Event1.setText(User.theEvents.get(0).getEventName() + "\n" + User.theEvents.get(0).getEventDescription());
        }
        if(User.theEvents.size() >= 2){
            Event2.setVisibility((View.VISIBLE));
            Event2.setClickable(true);
            Event2.setText(User.theEvents.get(1).getEventName() + "\n" + User.theEvents.get(1).getEventDescription());
        }
        if(User.theEvents.size() >= 3){
            Event3.setVisibility((View.VISIBLE));
            Event3.setClickable(true);
            Event3.setText(User.theEvents.get(2).getEventName() + "\n" + User.theEvents.get(2).getEventDescription());
        }
        if(User.theEvents.size() >= 4){
            Event4.setVisibility((View.VISIBLE));
            Event4.setClickable(true);
            Event4.setText(User.theEvents.get(3).getEventName() + "\n" + User.theEvents.get(3).getEventDescription());
        }
        if(User.theEvents.size() >= 5){
            Event5.setVisibility((View.VISIBLE));
            Event5.setClickable(true);
            Event5.setText(User.theEvents.get(4).getEventName() + "\n" + User.theEvents.get(4).getEventDescription());
        }
        if(User.theEvents.size() >= 6){
            Event6.setVisibility((View.VISIBLE));
            Event6.setClickable(true);
            Event6.setText(User.theEvents.get(5).getEventName() + "\n" + User.theEvents.get(5).getEventDescription());
        }
        if(User.theEvents.size() >= 7){
            Event7.setVisibility((View.VISIBLE));
            Event7.setClickable(true);
            Event7.setText(User.theEvents.get(6).getEventName() + "\n" + User.theEvents.get(6).getEventDescription());
        }
        if(User.theEvents.size() >= 8){
            Event8.setVisibility((View.VISIBLE));
            Event8.setClickable(true);
            Event8.setText(User.theEvents.get(7).getEventName() + "\n" + User.theEvents.get(7).getEventDescription());
        }
        if(User.theEvents.size() >= 9){
            Event9.setVisibility((View.VISIBLE));
            Event9.setClickable(true);
            Event9.setText(User.theEvents.get(8).getEventName() + "\n" + User.theEvents.get(8).getEventDescription());
        }
        if(User.theEvents.size() >= 10){
            Event10.setVisibility((View.VISIBLE));
            Event10.setClickable(true);
            Event10.setText(User.theEvents.get(9).getEventName() + "\n" + User.theEvents.get(9).getEventDescription());
        }
    }
}