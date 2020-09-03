package com.example.thetourist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ReligiousFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public ReligiousFragment() {
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
        myDataset.add(new Place(getString(R.string.religious1), getString(R.string.religious_about1), R.drawable.templejpg1));
        myDataset.add(new Place(getString(R.string.religious2), getString(R.string.religious_about2), R.drawable.templejpg2));
        myDataset.add(new Place(getString(R.string.religious3), getString(R.string.religious_about3), R.drawable.templejpg3));
        myDataset.add(new Place(getString(R.string.religious4), getString(R.string.religious_about4), R.drawable.temple4));
        myDataset.add(new Place(getString(R.string.religious5), getString(R.string.religious_about5), R.drawable.temple5));
        myDataset.add(new Place(getString(R.string.religious6), getString(R.string.religious_about6), R.drawable.temple6));
        myDataset.add(new Place(getString(R.string.religious7), getString(R.string.religious_about7), R.drawable.temple7));
        myDataset.add(new Place(getString(R.string.religious8), getString(R.string.religious_about7), R.drawable.temple8));
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
