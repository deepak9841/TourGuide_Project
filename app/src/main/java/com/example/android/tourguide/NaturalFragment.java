package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NaturalFragment extends Fragment {

    public NaturalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Creates the rootView
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array of natural Places
        ArrayList<Place> places= new ArrayList<Place>();
        places.add(new Place(R.drawable.chitawan_natl_park,R.string.title_chitawan,R.string.desc_chitawan, R.string.info_chitawan, R.string.web_chitawan));
        places.add(new Place(R.drawable.annapurna_basecamp,R.string.title_annapurna_s,R.string.desc_annapurna_s,R.string.info_annapurna,R.string.web_annapurna_s));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getContext(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
