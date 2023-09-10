package com.example.testapp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

public class User {
    private String username;
    private String password;
    private String userType;
    private int position;

    public static ArrayList<String> usernames = new ArrayList<String>();
    public static ArrayList<String> passwords = new ArrayList<String>();
    public static ArrayList<Events> theEvents = new ArrayList<Events>();
    public ArrayList<Events> myEvents;

    public User(String u, String p, String t){
        username = u;
        password = p;
        userType = t;
        usernames.add(u);
        passwords.add(p);
        position = User.usernames.size() - 1;
        MainActivity.usersList.add(this);
        myEvents = new ArrayList<Events>();
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUserType(){
        return this.userType;
    }

    public int getPosition() {
        return this.position;
    }
    public void updateUsername(String newName){
        this.username = newName;
        usernames.set(getPosition(), newName);
    }
    public void updatePassword(String newPass){
        this.password = newPass;
        passwords.set(getPosition(), newPass);
    }
}
