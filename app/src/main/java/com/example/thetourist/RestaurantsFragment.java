package com.example.thetourist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public RestaurantsFragment() {
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
        myDataset.add(new Place(getString(R.string.rest1), getString(R.string.rest_about1), -1));
        myDataset.add(new Place(getString(R.string.rest2), getString(R.string.rest_about2), -1));
        myDataset.add(new Place(getString(R.string.rest3), getString(R.string.rest_about3), -1));
        myDataset.add(new Place(getString(R.string.rest4), getString(R.string.rest_about4), -1));
        myDataset.add(new Place(getString(R.string.rest5), getString(R.string.rest_about5), -1));
        myDataset.add(new Place(getString(R.string.rest6), getString(R.string.rest_about6), -1));
        myDataset.add(new Place(getString(R.string.rest7), getString(R.string.rest_about7), -1));
        myDataset.add(new Place(getString(R.string.rest8), getString(R.string.rest_about8), -1));
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
