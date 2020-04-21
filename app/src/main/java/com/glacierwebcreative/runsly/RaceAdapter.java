package com.glacierwebcreative.runsly;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RaceAdapter extends ArrayAdapter<Race> {

    // Constructor
    public RaceAdapter(Activity context, ArrayList<Race> racesList) {
        super(context, 0, racesList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //int type = getItemViewType(position);
        //System.out.println("getView " + position + " " + convertView + " type = " + type);

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.single_race_details,
                    parent,false);
        }

        // Get the races object located at this position in the list
        Race currentRace = getItem(position);


        TextView raceNameTextView = (TextView) listItemView.findViewById(R.id.race_name);
        raceNameTextView.setText(currentRace.getmRaceName());

        TextView raceCityStateTextView = (TextView) listItemView.findViewById(R.id.race_city_state);
        raceCityStateTextView.setText(currentRace.getmCityAndState());

        TextView availableRacesTextView = (TextView) listItemView.findViewById(R.id.available_races);
        availableRacesTextView.setText(currentRace.getmRacesOffered());


        return listItemView;

    }
}
