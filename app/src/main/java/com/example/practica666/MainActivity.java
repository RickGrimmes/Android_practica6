package com.example.practica666;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.practica666.Adapter.SableAdapter;
import com.example.practica666.Models.Lightsaber;
import com.example.practica666.Models.Propietario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        //todo esto es nada más para que se haga la animación del fondo
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1500);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        List<Lightsaber> sables = new ArrayList<>();
        sables.add(new Lightsaber ("Rojo", "1", new Propietario("Darth Vader", "Oscuro")));
        sables.add(new Lightsaber ("Verde", "1", new Propietario("Luke Skywalker", "Luminoso")));
        sables.add(new Lightsaber ("Rojo", "2", new Propietario("Darth Maul", "Oscuro")));
        sables.add(new Lightsaber ("Azul", "1", new Propietario("Obi Wan Kenobi", "Luminoso")));

        SableAdapter sa = new SableAdapter(sables);
        RecyclerView rv =(RecyclerView) findViewById(R.id.rvLightsaber);
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}