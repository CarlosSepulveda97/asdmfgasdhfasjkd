package com.example.biblioteca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    // aqui mi ciclo de trabajo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void git(View v)
    {   //lista de datos para enviar
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("Farenheith");
        libros.add("Reival");
        libros.add("El Alquimista");

        Intent i = new Intent(this, Github_act.class);
        i.putExtra("listalibros", libros); //prepara el dato para enviar
        startActivity(i);
    }
}