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

        TextView monthTextView = findViewById(R.id.month);
        monthTextView.setText(currentRace.getmMonth());

        TextView dayInMonth = findViewById(R.id.day_in_month);
        dayInMonth.setText(String.valueOf(currentRace.getmDayInMonth()));

        TextView raceCityStateTextView = findViewById(R.id.city_and_state);
        raceCityStateTextView.setText(currentRace.getmCityAndState());

        TextView availableRacesTextView = findViewById(R.id.races_offered);
        availableRacesTextView.setText(currentRace.getmRacesOffered());

        TextView synopsisTextView= findViewById(R.id.synopsis);
        synopsisTextView.setText(currentRace.getmSynopsis());

        TextView directorOrganizerTextView= findViewById(R.id.director_organizer);
        directorOrganizerTextView.setText(currentRace.getmDirectorOrganizer());
    }
}