package com.example.travels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TravelAdapter extends RecyclerView.Adapter<TravelViewHolder> {
    private List<Integer> imagenes;

    public TravelAdapter(List<Integer> imagenes) {
        this.imagenes = imagenes;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_item,parent,false);
        return new TravelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        holder.imageView.setImageResource(imagenes.get(position));

    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }
}
