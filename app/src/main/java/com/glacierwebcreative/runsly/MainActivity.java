package com.glacierwebcreative.runsly;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private Button racesButton;
    private Button memberLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // "Races" button option
        racesButton = findViewById(R.id.races_button);
        racesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooseIntent = new Intent(MainActivity.this, ChooseRaceTypeActivity.class);
                startActivity(chooseIntent);
            }
        });


        // "Members Login" button option
        memberLoginButton = findViewById(R.id.member_login_button);
        memberLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, MemberLoginActivity.class);
                startActivity(loginIntent);
            }
        });

    }
}

