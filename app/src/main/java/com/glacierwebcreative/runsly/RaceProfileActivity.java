package com.glacierwebcreative.runsly;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RaceProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race_profile);


        Race currentRace = (Race) getIntent().getSerializableExtra("CurrentRace");
        System.out.println(currentRace);

        TextView raceNameTextView = findViewById(R.id.race_name);
        raceNameTextView.setText(currentRace.getmRaceName());

        TextView raceCityStateTextView = findViewById(R.id.city_and_state);
        raceCityStateTextView.setText(currentRace.getmCityAndState());

        TextView availableRacesTextView = findViewById(R.id.races_offered);
        availableRacesTextView.setText(currentRace.getmRacesOffered());
    }
}