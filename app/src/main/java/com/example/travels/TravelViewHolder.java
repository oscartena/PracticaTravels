package com.example.travels;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TravelViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;

    public TravelViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imagenTravel);
    }
}
