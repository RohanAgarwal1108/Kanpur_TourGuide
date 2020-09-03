package com.example.thetourist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thetourist.animations.Animations;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Place> place;

    public MyAdapter(ArrayList<Place> myDataset) {
        place = myDataset;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Place myplace = place.get(position);
        holder.name.setText(myplace.getName());
        holder.about.setText(myplace.getAbout());
        if (myplace.getImage() != -1) {
            holder.image.setImageResource(myplace.getImage());
        } else {
            holder.image.setImageResource(R.drawable.default1);
        }
        holder.viewMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean show = toggleLayout(!place.get(position).isExpanded(), v, holder.layoutExpand);
                place.get(position).setExpanded(show);
            }
        });
    }

    private boolean toggleLayout(boolean isExpanded, View v, LinearLayout layoutExpand) {
        Animations.toggleArrow(v, isExpanded);
        if (isExpanded) {
            Animations.expand(layoutExpand);
        } else {
            Animations.collapse(layoutExpand);
        }
        return isExpanded;
    }

    @Override
    public int getItemCount() {
        if (place != null) {
            return place.size();
        }
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;
        public final TextView about;
        public final ImageView image;
        public final ImageView viewMoreBtn;
        public final LinearLayout layoutExpand;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.view = itemView;
            name = view.findViewById(R.id.name);
            about = view.findViewById(R.id.about);
            image = view.findViewById(R.id.image);
            viewMoreBtn = view.findViewById(R.id.spinner);
            layoutExpand = view.findViewById(R.id.expand);
        }
    }
}
