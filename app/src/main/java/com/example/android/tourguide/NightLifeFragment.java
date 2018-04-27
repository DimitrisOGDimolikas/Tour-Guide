package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLifeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.wine_bar, R.string.wine_bar_info,
                R.string.wine_bar_address, R.string.wine_bar_phone, R.drawable.img_wine_bar));
        items.add(new Item(R.string.brettos_bar, R.string.brettos_bar_info,
                R.string.brettos_bar_address, R.string.brettos_bar_phone, R.drawable.img_brettos_bar));
        items.add(new Item(R.string.taf_art, R.string.taf_art_info,
                R.string.taf_art_address, R.string.taf_art_phone, R.drawable.img_taf_art));
        items.add(new Item(R.string.a_bar, R.string.a_bar_info,
                R.string.a_bar_address, R.string.a_bar_phone, R.drawable.img_a_bar));
        items.add(new Item(R.string.clumsies, R.string.clumsies_info,
                R.string.clumsies_address, R.string.clumsies_phone, R.drawable.img_clumsies));
        items.add(new Item(R.string.local_pub, R.string.local_pub_info,
                R.string.local_pub_address, R.string.local_pub_phone, R.drawable.img_local_pub));
        items.add(new Item(R.string.thesis, R.string.thesis_info,
                R.string.thesis_address, R.string.thesis_phone, R.drawable.img_thesis));
        items.add(new Item(R.string.prima_cava, R.string.prima_cava_info,
                R.string.prima_cava_address, R.string.prima_cava_phone, R.drawable.img_prima_cava));

        // Create an ItemAdapter, whose data source is a list of Items. The
        // adapter knows how to create list items for each item in the list
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.colorNightLife);

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
