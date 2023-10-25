package com.example.practica666;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        // Obtén referencias a los elementos de la interfaz de usuario en activity_detalles.xml
        TextView colorTextView = findViewById(R.id.colorTextView);
        TextView hojasTextView = findViewById(R.id.hojasTextView);
        TextView propietarioTextView = findViewById(R.id.propietarioTextView);

// Obtén los datos pasados a través del Intent
        Intent intent = getIntent();
        String color = intent.getStringExtra("color");
        String hojas = intent.getStringExtra("hojas");
        String propietario = intent.getStringExtra("propietario");

// Establece los valores en los TextViews
        colorTextView.setText("Color: " + color);
        hojasTextView.setText("Hojas: " + hojas);
        propietarioTextView.setText("Propietario: " + propietario);

    }
}