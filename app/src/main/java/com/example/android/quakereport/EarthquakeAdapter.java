package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 08/03/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_view, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);


        TextView mag = (TextView) listView.findViewById(R.id.mag);
        mag.setText(currentEarthquake.getMag());

        TextView location = (TextView) listView.findViewById(R.id.location);
        location.setText(currentEarthquake.getLocation());

        TextView date = (TextView) listView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());


        return listView;
    }
}
