package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class AttractionsFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(R.string.parthenon, R.string.parthenon_info, R.string.parthenon_address,
                R.drawable.img_parthenon));
        items.add(new Item(R.string.acropolis, R.string.acropolis_info, R.string.acropolis_address,
                R.drawable.img_acropolis));
        items.add(new Item(R.string.temple_zeus, R.string.temple_zeus_info, R.string.temple_zeus_address,
                R.drawable.img_temple_zeus));
        items.add(new Item(R.string.theater_dionysos, R.string.theater_dionysos_info, R.string.theater_dionysos_address,
                R.drawable.img_theater_dionysos));
        items.add(new Item(R.string.hadrian_arch, R.string.hadrian_arch_info, R.string.hadrian_arch_address,
                R.drawable.img_hadrian_arch));
        items.add(new Item(R.string.roman_agora, R.string.roman_agora_info, R.string.roman_agora_address,
                R.drawable.img_roman_agora));
        items.add(new Item(R.string.ancient_agora, R.string.ancient_agora_info, R.string.ancient_agora_address,
                R.drawable.img_ancient_agora));
        items.add(new Item(R.string.plaka, R.string.plaka_info, R.string.plaka_address,
                R.drawable.img_plaka));

        // Create an ItemAdapter, whose data source is a list of Items. The
        // adapter knows how to create list items for each item in the list
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.colorAttractions);

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