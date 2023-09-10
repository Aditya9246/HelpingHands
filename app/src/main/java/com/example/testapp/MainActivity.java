package com.example.testapp;

import static java.lang.System.exit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.text.InputType;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<User> usersList = new ArrayList<User>();
    public ArrayList<Events> eventsList = new ArrayList<Events>();
    public static String currUser;
    public static String currPassword;
    public static String userType;
    public static int userNumber;
    public static User currentUserObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        User adi = new User("Aditya", "Pikachu123", "Student");
        User admin = new User("Admin", "Admin123", "Admin");
        usersList.add(adi);
        usersList.add(admin);

        //home_page
        TextView usernameTextID = (TextView) findViewById(R.id.usernameText);
        ImageButton nextButton = (ImageButton) findViewById(R.id.nextButtonHome);
        ImageButton backButton = (ImageButton) findViewById(R.id.backButtonHome);
        EditText usernameEntryField = (EditText) findViewById(R.id.usernameEntry);
        EditText passwordEntryField = (EditText) findViewById(R.id.passwordEntry);
        Button signUpButton = (Button) findViewById(R.id.signUpButton);
        Button cancelSignUpButton = (Button) findViewById(R.id.cancelSignUpButton);
        EditText passwordSignUpField = (EditText) findViewById(R.id.passwordSignUpField);
        TextView passwordSignUpText = (TextView) findViewById(R.id.passwordSignUpText);
        TextView newUserText = (TextView) findViewById(R.id.newUserText);
        RadioButton studentRadioButton = (RadioButton) findViewById(R.id.studentRadioButton);
        RadioButton adminRadioButton = (RadioButton) findViewById(R.id.adminRadioButton);
        TextView userTypeText = (TextView) findViewById(R.id.userTypeText);


        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if(usernameTextID.getText().equals("Username:")){
                    currUser = usernameEntryField.getText().toString();
                    usernameTextID.setText("Password:");
                    usernameEntryField.setText("");
                    usernameEntryField.setVisibility(View.INVISIBLE);
                    usernameEntryField.setClickable(false);
                    passwordEntryField.setVisibility(View.VISIBLE);
                    passwordEntryField.setClickable(true);
                    backButton.setVisibility(View.VISIBLE);
                    backButton.setClickable(true);
                }
                if(usernameTextID.getText().equals("Password:")){
                    currPassword = passwordEntryField.getText().toString();
                    for(int i = 0; i < usersList.size(); i++){
                        if(currUser.equals(usersList.get(i).getUsername())){
                            userNumber = i;
                            break;
                        }
                    }
                    if(currPassword.equals(usersList.get(userNumber).getPassword())){
                        currentUserObj = usersList.get(userNumber);
                        Intent intent = new Intent(MainActivity.this, mainPage.class);
                        startActivity(intent);
                    }
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                usernameTextID.setText("Username:");
                passwordEntryField.setText("");
                passwordEntryField.setVisibility(View.INVISIBLE);
                passwordEntryField.setClickable(false);
                usernameEntryField.setVisibility(View.VISIBLE);
                usernameEntryField.setClickable(true);
                nextButton.setVisibility(View.VISIBLE);
                nextButton.setClickable(true);
                backButton.setVisibility(View.INVISIBLE);
                backButton.setClickable(false);
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signUpButton.getText().equals("Sign Up")) {
                    newUserText.setVisibility(View.INVISIBLE);
                    cancelSignUpButton.setVisibility(View.VISIBLE);
                    cancelSignUpButton.setClickable(true);
                    passwordSignUpText.setVisibility(View.VISIBLE);
                    passwordSignUpField.setVisibility(View.VISIBLE);
                    passwordSignUpField.setClickable(true);
                    nextButton.setVisibility(View.INVISIBLE);
                    nextButton.setClickable(false);
                    signUpButton.setText("Create login");
                    userTypeText.setVisibility(View.VISIBLE);
                    studentRadioButton.setVisibility(View.VISIBLE);
                    studentRadioButton.setClickable(true);
                    studentRadioButton.setChecked(true);
                    adminRadioButton.setVisibility(View.VISIBLE);
                    adminRadioButton.setClickable(true);
                    adminRadioButton.setChecked(false);
                }
                else{
                    currUser = usernameEntryField.getText().toString();
                    currPassword = passwordSignUpField.getText().toString();
                    if(studentRadioButton.isChecked()){
                        userType = "Student";
                    }
                    else{
                        userType = "Admin";
                    }
                    User newUser = new User(currUser, currPassword, userType);
                    usersList.add(newUser);
                    currentUserObj = newUser;
                    Intent intent = new Intent(MainActivity.this, mainPage.class);
                    startActivity(intent);
                }
            }
        });
        cancelSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newUserText.setVisibility(View.VISIBLE);
                passwordSignUpText.setVisibility(View.INVISIBLE);
                passwordSignUpField.setVisibility(View.INVISIBLE);
                passwordSignUpField.setClickable(false);
                nextButton.setVisibility(View.VISIBLE);
                nextButton.setClickable(true);
                signUpButton.setText("Sign Up");
                userTypeText.setVisibility(View.INVISIBLE);
                studentRadioButton.setVisibility(View.INVISIBLE);
                studentRadioButton.setClickable(false);
                adminRadioButton.setVisibility(View.INVISIBLE);
                adminRadioButton.setClickable(false);
                cancelSignUpButton.setVisibility(View.INVISIBLE);
                cancelSignUpButton.setClickable(false);
            }
        });

        studentRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(studentRadioButton.isChecked()){
                    adminRadioButton.setChecked(false);
                }
                else{
                    adminRadioButton.setChecked(true);
                }
            }
        });

        adminRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(adminRadioButton.isChecked()){
                    studentRadioButton.setChecked(false);
                }
                else{
                    studentRadioButton.setChecked(true);
                }
            }
        });
    }

}