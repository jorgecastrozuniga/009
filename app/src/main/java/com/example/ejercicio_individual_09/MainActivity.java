package com.example.ejercicio_individual_09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_individual_09.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding vbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Se realiza inflacion a la vista de binding
        vbinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = vbinding.getRoot();
        setContentView(view);


        /* Se declara Intent
        Intent intento = getIntent();*/


        vbinding.foto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar(""+R.drawable.ima1);
            }
        });

        vbinding.foto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar(""+R.drawable.ima2);
            }
        });

        vbinding.foto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar(""+R.drawable.ima3);
            }
        });

        vbinding.foto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar(""+R.drawable.ima4);
            }
        });

        vbinding.botoncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
    public void llamar(String foto) {
        Intent intento = new Intent(MainActivity.this, MainActivity2.class);
        intento.putExtra("Foto", foto);
        startActivity(intento);
    }


}