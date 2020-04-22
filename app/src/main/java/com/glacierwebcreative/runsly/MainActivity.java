package com.glacierwebcreative.runsly;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Home Page
        ImageView homePage = (ImageView) findViewById(R.id.home);

        // Set a click listener on that View
        homePage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent chooseIntent = new Intent(MainActivity.this, ChooseRaceTypeActivity.class);

                startActivity(chooseIntent);
            }
        });
    }
}

