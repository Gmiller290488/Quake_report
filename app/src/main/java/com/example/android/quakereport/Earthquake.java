package com.example.android.quakereport;

public class Earthquake {

    private String mMag;

    private String mLocation;

    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param mag is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */

    public Earthquake(String mag, String location, long timeInMilliseconds) {
        mMag = mag;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getMag() {return mMag; }

    public String getLocation() {return mLocation; }

    public long getTimeInMilliseconds() {return mTimeInMilliseconds; }
}