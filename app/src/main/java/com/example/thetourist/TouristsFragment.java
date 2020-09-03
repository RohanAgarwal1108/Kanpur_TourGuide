package com.example.thetourist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TouristsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public TouristsFragment() {
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
        myDataset.add(new Place(getString(R.string.tourist1), getString(R.string.tourist_about1), -1));
        myDataset.add(new Place(getString(R.string.tourist2), getString(R.string.tourist_about2), -1));
        myDataset.add(new Place(getString(R.string.tourist3), getString(R.string.tourist_about3), -1));
        myDataset.add(new Place(getString(R.string.tourist4), getString(R.string.tourist_about4), -1));
        myDataset.add(new Place(getString(R.string.tourist5), getString(R.string.tourist_about5), -1));
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
