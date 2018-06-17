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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Creates the rootView
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array of hotels
        ArrayList<Place> places= new ArrayList<Place>();
        places.add(new Place(R.drawable.everest_hotel,R.string.title_hotelEverest,R.string.desc_hotelEverest, R.string.info_hotelEverest, R.string.web_hotelEverest));
        places.add(new Place(R.drawable.hyatt_regency_kathmandu,R.string.title_hyattKtm,R.string.desc_hyattKtm,R.string.info_hyattKtm,R.string.web_hyattKtm));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getContext(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
