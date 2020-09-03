package com.example.thetourist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Place> myDataset = new ArrayList<>();
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        super.onCreate(savedInstanceState);
        recyclerView = rootView.findViewById(R.id.events_recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        myDataset.add(new Place(getString(R.string.event1), getString(R.string.event_about1), -1));
        myDataset.add(new Place(getString(R.string.event2), getString(R.string.event_about2), -1));
        myDataset.add(new Place(getString(R.string.event3), getString(R.string.event_about3), -1));
        myDataset.add(new Place(getString(R.string.event4), getString(R.string.event_about4), -1));
        myDataset.add(new Place(getString(R.string.event5), getString(R.string.event_about5), -1));
        myDataset.add(new Place(getString(R.string.event6), getString(R.string.event_about6), -1));
        myDataset.add(new Place(getString(R.string.event7), getString(R.string.event_about7), -1));
        myDataset.add(new Place(getString(R.string.event8), getString(R.string.event_about8), -1));
        myDataset.add(new Place(getString(R.string.event9), getString(R.string.event_about9), -1));
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
