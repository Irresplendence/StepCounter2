package com.example.stepcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hub extends AppCompatActivity {
    // Buttons!
    private Button registerButton; // Button used to get to the registration page.
    private Button musicButton;  // Button used to get to the music page.
    private Button loginButton; // Button that takes you to the login page.
    private Button personalButton; // Button that takes you to the personal page.
    private Button supportButton; // Button that takes you to the support page.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            startActivity(new Intent(Hub.this, register.class));
                finish();
            }


        });
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              startActivity(new Intent(Hub.this, music.class));
                finish();

            }

            
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            startActivity(new Intent(Hub.this, login.class));
                finish();

            }

            ;
        });

        personalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              startActivity(new Intent(Hub.this, personal.class));
                finish();

            }

            ;
        });

        supportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              startActivity(new Intent(Hub.this, support.class));
                finish();

            }

            ;
        });
    };}
