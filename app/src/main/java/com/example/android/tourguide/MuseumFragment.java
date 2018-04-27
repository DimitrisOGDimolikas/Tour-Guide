package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.acropolis_museum, R.string.acropolis_museum_info,
                R.string.acropolis_museum_address, R.string.acropolis_museum_phone, R.drawable.img_acropolis_museum));
        items.add(new Item(R.string.historical_museum, R.string.historical_museum_info,
                R.string.historical_museum_address, R.string.historical_museum_phone, R.drawable.img_historical_museum));
        items.add(new Item(R.string.benaki_museum, R.string.benaki_museum_info,
                R.string.benaki_museum_address, R.string.benaki_museum_phone, R.drawable.img_benaki_museum));
        items.add(new Item(R.string.goulandris_museum, R.string.goulandris_museum_info,
                R.string.goulandris_museum_address, R.string.goulandris_museum_phone, R.drawable.img_goulandris_museum));
        items.add(new Item(R.string.herakleion_museum, R.string.herakleion_museum_info,
                R.string.herakleion_museum_address, R.string.herakleion_museum_phone, R.drawable.img_herakleion_museum));
        items.add(new Item(R.string.archeological_museum, R.string.archeological_museum_info,
                R.string.archeological_museum_address, R.string.archeological_museum_phone, R.drawable.img_archeological_museum));
        items.add(new Item(R.string.athens_museum, R.string.athens_museum_info,
                R.string.athens_museum_address, R.string.athens_museum_phone, R.drawable.img_athens_museum));
        items.add(new Item(R.string.folk_museum, R.string.folk_museum_info,
                R.string.folk_museum_address, R.string.folk_museum_phone, R.drawable.img_folk_museum));

        // Create an ItemAdapter, whose data source is a list of Items. The
        // adapter knows how to create list items for each item in the list
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.colorMuseums);

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