package com.example.ejercicio_individual_09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_individual_09.databinding.ActivityMain2Binding;
import com.example.ejercicio_individual_09.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMain2Binding abinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        abinding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = abinding.getRoot();
        setContentView(view);


        // Se declara Intent
        Intent intento = getIntent();

        // Se recibe String foto, se parsea a entero.
        String foto= intento.getStringExtra("foto");
        abinding.fotorecibida.setImageResource(Integer.parseInt(foto));


        abinding.botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}