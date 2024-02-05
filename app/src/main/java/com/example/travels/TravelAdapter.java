package com.example.travels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/** TravelAdapter es el adaptador para el RecyclerView que muestra la lista de imágenes de viajes.
 * @see TravelViewHolder ViewHolder para el RecyclerView.
 * @author Oscar Tena Marin
 * @version 2024-02-05
 */
public class TravelAdapter extends RecyclerView.Adapter<TravelViewHolder> {
    private List<Integer> imagenes;

    public TravelAdapter(List<Integer> imagenes) {
        this.imagenes = imagenes;
    }

    /**
     * Método que se ejecuta al crear el ViewHolder.
     * @param parent Grupo de vistas al que pertenece el ViewHolder.
     * @param viewType Tipo de vista.
     * @return Nuevo ViewHolder.
     */
    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_item,parent,false);
        return new TravelViewHolder(v);
    }

    /**
     * Método que se ejecuta al enlazar el ViewHolder con la posición.
     * @param holder ViewHolder que se va a enlazar.
     * @param position Posición del ViewHolder.
     */
    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        int idImagen = imagenes.get(position);
        holder.imageView.setImageResource(idImagen);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageSwitcher imageSwitcher = view.getRootView().findViewById(R.id.imageSwitcher);
                imageSwitcher.setImageResource(idImagen);
            }
        });

    }
    /**
     * Método que devuelve el número de elementos en la lista.
     * @return Número de elementos en la lista.
     */
    @Override
    public int getItemCount() {
        return imagenes.size();
    }
}
