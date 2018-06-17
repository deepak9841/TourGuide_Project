package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dpak on 1/15/18.
 */

class PlaceAdapter extends ArrayAdapter <Place> {
    /** Resource ID for the background color for this list of places */

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Place currentPlace= getItem(position);
        //getting the title view

        TextView TitleTextView=(TextView) listItemView.findViewById(R.id.title_view);

        TitleTextView.setText(currentPlace.getTitle());

//getting description view
        TextView DescriptionTextView=(TextView) listItemView.findViewById(R.id.description_view);
        //Check if description is provided for this place or not
        if (currentPlace.hasDescription()){
            DescriptionTextView.setText(currentPlace.getDescription());

            DescriptionTextView.setVisibility(View.VISIBLE);
        } else {
            DescriptionTextView.setVisibility(View.GONE);
        }



        //getting information view
        TextView InformationTextView=(TextView) listItemView.findViewById(R.id.info_view);
        //Check if description is provided for this place or not
        if (currentPlace.hasInformation()){
            InformationTextView.setText(currentPlace.getInformation());

            InformationTextView.setVisibility(View.VISIBLE);
        } else {
            InformationTextView.setVisibility(View.GONE);
        }


        //getting weblink view
        TextView WeblinkTextView=(TextView) listItemView.findViewById(R.id.weblink_view);
        //Check if description is provided for this place or not
        if (currentPlace.hasWeblink()){
            WeblinkTextView.setText(currentPlace.getWeblink());

            WeblinkTextView.setVisibility(View.VISIBLE);
        } else {
            WeblinkTextView.setVisibility(View.GONE);
        }

        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
