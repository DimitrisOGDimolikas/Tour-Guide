package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private static final String LOG_TAG = ItemAdapter.class.getSimpleName();
    private int mColorId;

    public ItemAdapter(Activity context, ArrayList<Item> items, int colorId) {
        super(context, 0, items);
        mColorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        // Initialize the currentItem's TextView and check the one's
        // which aren't given to all Items (Reasoning: Couldn't put address in an activity)
        TextView locationTitleTextView = listItemView.findViewById(R.id.locationTitle);
        locationTitleTextView.setText(currentItem.getmLocationTitle());

        TextView locationDescriptionTextView = listItemView.findViewById(R.id.locationDescription);
        locationDescriptionTextView.setText(currentItem.getmLocationDescription());

        TextView locationAddressTextView = listItemView.findViewById(R.id.locationAddress);
        locationAddressTextView.setText(currentItem.getmLocationAddress());

        if (currentItem.hasAddress()){
            locationAddressTextView.setVisibility(View.VISIBLE);
        } else {
            locationAddressTextView.setVisibility(View.GONE);
        }

        TextView locationNumberTextView = listItemView.findViewById(R.id.locationNumber);
        locationNumberTextView.setText(currentItem.getmLocationNumber());

        if (currentItem.hasNumber()){
            locationNumberTextView.setVisibility(View.VISIBLE);
        } else {
            locationNumberTextView.setVisibility(View.GONE);
        }

        // Check if there's an image for our Layout
        ImageView mImageId = listItemView.findViewById(R.id.image);

        if (currentItem.hasImage()) {
            mImageId.setImageResource(currentItem.getImageId());
            mImageId.setVisibility(View.VISIBLE);
        } else {
            mImageId.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}