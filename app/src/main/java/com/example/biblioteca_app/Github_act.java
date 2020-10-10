package com.example.biblioteca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Github_act extends AppCompatActivity {

    private Spinner spin;
    private TextView text;

    @Override //ciclo de trabajo
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        //llamo a los elementos de la interfaz
        spin = (Spinner)findViewById(R.id.spinlibros);
        text = (TextView)findViewById(R.id.tv1);

        //Recibo los datos de mi lista de datos del MainActivity
        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listalibros");

        //con esto relleno el spinner y le paso mi arreglo de libros
        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaLibros);

        spin.setAdapter(adapt); // lepaso mi listado adapt
    }

}