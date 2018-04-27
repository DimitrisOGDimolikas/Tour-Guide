package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.delphi_trip, R.string.delphi_trip_info,
                R.drawable.img_delphi_trip));
        items.add(new Item(R.string.islands_cruise, R.string.islands_cruise_info,
                R.drawable.img_island_cruise));
        items.add(new Item(R.string.sounion_trip, R.string.sounion_trip_info,
                R.drawable.img_sounion_trip));
        items.add(new Item(R.string.riviera_trip, R.string.riviera_trip_info,
                R.drawable.img_riviera_trip));
        items.add(new Item(R.string.sky_dinner, R.string.sky_dinner_info,
                R.drawable.img_sky_dinner));
        items.add(new Item(R.string.bar_tour, R.string.bar_tour_info,
                R.drawable.img_bar_tour));
        items.add(new Item(R.string.corinth_trip, R.string.corinth_trip_info,
                R.drawable.img_corinth_trip));
        items.add(new Item(R.string.walking_tour, R.string.walking_tour_info,
                R.drawable.img_walking_tour));

        // Create an ItemAdapter, whose data source is a list of Items. The
        // adapter knows how to create list items for each item in the list
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.colorActivities);

        // Find the ListView object in the view hierarchy
        ListView listView = rootView.findViewById(R.id.list);

        // Make the ListView use the ItemAdapter we created above, so that it
        // will display list items for each Item in the list.
        listView.setAdapter(adapter);


       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Item item = items.get(position);
            }
        }); */

        return rootView;

    }

}
