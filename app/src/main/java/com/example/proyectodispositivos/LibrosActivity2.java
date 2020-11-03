package com.example.proyectodispositivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.util.Log;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class LibrosActivity2 extends AppCompatActivity {

    private ListView listView;

    private ArrayList <String> libros;

    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros2);

        listView = findViewById(R.id.listviewLibros);
        libros = new ArrayList<>();

        libros.add("3.Buenas.Practicas.Ganaderas.pdf");
        libros.add("AYUDANDO A DESARROLLAR UNA GANADERIA.pdf");
        libros.add("Ganadería y cría de animales.pdf");
        libros.add("LibroGanaderiaXico_2016.pdf");
        libros.add("Manual de Buenas Prácticas.pdf");

        ArrayAdapter <String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, libros);

        listView.setAdapter(adapter);

    }




    }
