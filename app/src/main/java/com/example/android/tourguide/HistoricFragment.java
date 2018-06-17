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
public class HistoricFragment extends Fragment {

    public HistoricFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Creates the rootView
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.kathmandu_durbar_square,R.string.title_kathmandu,R.string.desc_kathmandu, R.string.info_kathmandu, R.string.web_kathmandu));
        places.add(new Place(R.drawable.bhaktapur_durbar_square,R.string.title_bhaktapur,R.string.desc_bhaktapur,R.string.info_bhaktapur,R.string.web_bhaktapur));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
