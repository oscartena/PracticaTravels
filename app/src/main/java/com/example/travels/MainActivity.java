package com.example.travels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.travels.databinding.ActivityMainBinding;

import java.util.List;

/**
 * MainActivity de la aplicación Travels que muestra una lista de imágenes en un RecyclerView y al hacer clic en una de ellas se muestra en un ImageSwitcher.
 * @see TravelAdapter Adaptador para el RecyclerView.
 * @author Oscar Tena Marin
 * @version 2024-02-05
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private List<Integer> imagenes = List.of(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
    );

    /**
     * Método que se ejecuta al crear la actividad.
     * @param savedInstanceState Instancia guardada con el estado de la actividad.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recycler1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.recycler1.setAdapter(new TravelAdapter(imagenes));

        ImageSwitcher is = findViewById(R.id.imageSwitcher);
        is.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                return imageView;
            }
        });

    }
}