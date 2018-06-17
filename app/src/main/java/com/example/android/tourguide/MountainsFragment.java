package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MountainsFragment extends Fragment {

    public MountainsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Creates the rootView
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array of hotels
        ArrayList<Place> places= new ArrayList<Place>();
        places.add(new Place(R.drawable.mount_everest,R.string.title_mountEverest));
        places.add(new Place(R.drawable.dhaulagiri,R.string.title_dhaulagiri));
        places.add(new Place(R.drawable.manaslu,R.string.title_manaslu));
        places.add(new Place(R.drawable.makalu,R.string.title_makalu));
        places.add(new Place(R.drawable.kanchanjunga,R.string.title_kanchanjunga));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getContext(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
