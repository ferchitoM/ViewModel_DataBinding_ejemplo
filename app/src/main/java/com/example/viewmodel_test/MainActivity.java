package com.example.viewmodel_test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contador contador = new ViewModelProvider(this).get(Contador.class);

        TextView textView = findViewById(R.id.mostrarContador);
        textView.setText(contador.i + "");
        Button botonAumentar = findViewById(R.id.botonAumentar);

        botonAumentar.setOnClickListener(view -> {
            contador.i++;
            textView.setText(contador.i + "");
        });

        Button botonSiguiente = findViewById(R.id.botonSiguiente);
        botonSiguiente.setOnClickListener(view -> {
            startActivity(new Intent(this, DBActivity.class));
        });

    }
}