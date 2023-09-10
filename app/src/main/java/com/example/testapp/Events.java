package com.example.testapp;
import java.util.*;

public class Events {
    public String eventName;
    public String eventDescription;
    public User owner;

    public Events(String name, String description, User currentAdmin){
        eventName = name;
        eventDescription = description;
        owner = currentAdmin;
    }

    public String getEventName(){
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }
}
