package com.example.giannirandone.spiel1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    TextView settingsTextViewHighscoreAusgabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settingsTextViewHighscoreAusgabe = (TextView) findViewById(R.id.settingsTextViewHighscoreAusgabe);


    }


    public void onClick(View v)
    {

    //---

    }

}