package com.glacierwebcreative.runsly;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Steve on 9/16/2019.
 * {@link Race} represents a race , one of 3 types, Road, Trail and Obstacle
 * and has the following fields.
 *
 */

public class Race implements Serializable {



    private int mID;
    private String mRaceName;
    private int mRaceCategory;
    private String mCityAndState;
    private String mRacesOffered;
    private String mSeason;
    private String mMonth;
    private int mDayInMonth;
    private String mDirectorOrganizer;
    private String mSynopsis;
    private String mRaceWebsite;




    //Constructor
    public Race(int id, String raceName, int raceCategory, String cityAndState, String racesOffered,
                String season, String month, int dayInMonth, String directorOrganizer,
                String synopsis, String raceWebsite) {
        mID = id;
        mRaceName = raceName;
        mRaceCategory = raceCategory;
        mCityAndState = cityAndState;
        mRacesOffered = racesOffered;
        mSeason = season;
        mMonth = month;
        mDayInMonth = dayInMonth;
        mDirectorOrganizer = directorOrganizer;
        mSynopsis = synopsis;
        mRaceWebsite = raceWebsite;


    }



    //@Override
    public String toString() {
        return "Race{" +
                "ID=" + mID +
                ", Race Name='" + mRaceName + '\'' +
                ", Race Category='" + mRaceCategory + '\'' +
                ", City And State='" + mCityAndState + '\'' +
                ", Races Offered='" + mRacesOffered + '\'' +
                ", Season='" + mSeason + '\'' +
                ", Month='" + mMonth + '\'' +
                ", Day In Month='" + mDayInMonth + '\'' +
                ", Director Organizer='" + mDirectorOrganizer + '\'' +
                ", Synopsis='" + mSynopsis + '\'' +
                ", Race Website='" + mRaceWebsite + '\'' +

                '}' + '\n' + '\n';
    }


    public int getmID() {
        return mID;
    }

    public String getmRaceName() {
        return mRaceName;
    }

    public int getmRaceCategory() {
        return mRaceCategory; }

    public String getmCityAndState() {
        return mCityAndState;
    }

    public String getmRacesOffered() {
        return mRacesOffered;
    }

    public String getmSeason() {
        return mSeason;
    }

    public String getmMonth() {
        return mMonth;
    }

    public int getmDayInMonth() {
        return mDayInMonth;
    }

    public String getmDirectorOrganizer() {
        return mDirectorOrganizer;
    }

    public String getmSynopsis() {
        return mSynopsis;
    }

    public String getmRaceWebsite() {
        return mRaceWebsite;
    }
}
