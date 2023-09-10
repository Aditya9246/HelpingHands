package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class CreateEvent extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_event_page);

        Button createEventFinalButton = (Button) findViewById(R.id.createEventFinalButton);
        Button cancelButton3 = (Button) findViewById(R.id.cancelButton3);
        EditText eventNameField = (EditText) findViewById(R.id.eventNameFeild);
        EditText descriptionField = (EditText) findViewById(R.id.descriptionField);
        ImageButton profileButton5 = (ImageButton) findViewById(R.id.profileButton5);
        ImageButton settingsButton5 = (ImageButton) findViewById(R.id.profileButton5);
        ImageButton eventsButton5 = (ImageButton) findViewById(R.id.eventsButton5);

        profileButton5.setBackgroundColor(Color.rgb(33, 150, 243));

        //createEventFinalButton
        createEventFinalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eventName = eventNameField.getText().toString();
                String description = descriptionField.getText().toString();
                Events newEvent = new Events(eventName, description, MainActivity.currentUserObj);
                User.theEvents.add(newEvent);
                MainActivity.currentUserObj.myEvents.add(newEvent);
                Intent intent = new Intent(CreateEvent.this, ProfilePageAdmin.class);
                startActivity(intent);
            }
        });

        //cancelButton3 click event
        cancelButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEvent.this, ProfilePageAdmin.class);
                startActivity(intent);
            }
        });

        //eventsButton5 click event
        eventsButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEvent.this, mainPage.class);
                startActivity(intent);
            }
        });

        //settingsButton5 click event
        settingsButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEvent.this, SettingsPage.class);
                startActivity(intent);
            }
        });

        //profileButton5 click event
        profileButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEvent.this, ProfilePageAdmin.class);
                startActivity(intent);
            }
        });
    }
}
