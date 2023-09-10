package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EventSignUp extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_signup);

        Button SignUpButtonEvent = (Button) findViewById(R.id.SignUpButtonEvent);
        Button CancelButtonEvent = (Button) findViewById(R.id.CancelButtonEvent);
        TextView eventNameTextContent = (TextView) findViewById(R.id.eventNameTextContent);
        TextView eventDescriptionTextContent = (TextView) findViewById(R.id.eventDescriptionTextContent);
        ImageButton profileButton6 = (ImageButton) findViewById(R.id.profileButton6);
        ImageButton settingsButton6 = (ImageButton) findViewById(R.id.settingsButton6);
        ImageButton eventsButton6 = (ImageButton) findViewById(R.id.eventsButton6);

        eventsButton6.setBackgroundColor(Color.rgb(33, 150, 243));


        eventNameTextContent.setText(mainPage.selectedEvent.getEventName());
        eventDescriptionTextContent.setText(mainPage.selectedEvent.getEventDescription());

        //SignUpButtonEvent
        SignUpButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.currentUserObj.myEvents.add(mainPage.selectedEvent);
                mainPage.hasSignedUp = true;
//                mainPage.eventNum = User.theEvents.indexOf(mainPage.selectedEvent) + 1;
                Intent intent = new Intent(EventSignUp.this, mainPage.class);
                startActivity(intent);
            }
        });

        //SignUpButtonEvent
        CancelButtonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventSignUp.this, mainPage.class);
                startActivity(intent);
            }
        });
    }
}
