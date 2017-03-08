package com.example.android.quakereport;

public class Earthquake {

    private String mMag;

    private String mLocation;

    private String mDate;

    public Earthquake(String mag, String location, String date) {
        mMag = mag;
        mLocation = location;
        mDate = date;
    }

    public String getMag() {return mMag; }

    public String getLocation() {return mLocation; }

    public String getDate() {return mDate; }
}