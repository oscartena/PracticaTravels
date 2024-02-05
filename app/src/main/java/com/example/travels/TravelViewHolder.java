package com.example.travels;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/** TravelViewHolder es el ViewHolder para el RecyclerView que muestra la lista de imágenes de viajes.
 * @author Oscar Tena Marin
 * @version 2024-02-05
 */
public class TravelViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;

    public TravelViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imagenTravel);
    }
}
