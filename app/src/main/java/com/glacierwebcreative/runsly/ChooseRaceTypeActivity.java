package com.glacierwebcreative.runsly;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ChooseRaceTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_race_type);


        // Find view that shows Road Races
        ImageView roadRaces = (ImageView) findViewById(R.id.road);

        // Set onClickListener on view
        roadRaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roadRacesIntent = new Intent(ChooseRaceTypeActivity.this, RoadRaceActivity.class);

                startActivity(roadRacesIntent);
            }
        });


        // Find view that shows Trail Races
        ImageView trailRaces = (ImageView) findViewById(R.id.trail);

        // Set onClickListener on view
        trailRaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trailRacesIntent = new Intent(ChooseRaceTypeActivity.this, TrailRaceActivity.class);

                startActivity(trailRacesIntent);
            }
        });


        // Find view that shows Obstacle Races
        ImageView obstacleRaces = (ImageView) findViewById(R.id.obstacle);

        // Set onClickListener on view
        obstacleRaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obstacleRacesIntent = new Intent(ChooseRaceTypeActivity.this, ObstacleRaceActivity.class);

                startActivity(obstacleRacesIntent);
            }
        });
    }
}
