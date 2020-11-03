package com.example.proyectodispositivos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {

    FirebaseAuth auth;

    private Button login;
    private Button registrar;
    private Button cerrarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        login = findViewById(R.id.iniciarSesionPantalla);
        registrar = findViewById(R.id.registrarPantalla);
        cerrarSesion = findViewById(R.id.cerrarSesion_btn);

        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()!= null){
            login.setVisibility(View.GONE);
            registrar.setVisibility(View.GONE);
            cerrarSesion.setVisibility(View.VISIBLE);

        }
    }

    public void irIniciar(View view){
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrarse(View view){
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }

    public void cerrarSesion(View view){
        auth.signOut();
        if(auth.getCurrentUser() == null){
            login.setVisibility(View.VISIBLE);
            registrar.setVisibility(View.VISIBLE);
            cerrarSesion.setVisibility(View.GONE);

        }
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void irPrincipal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void irMapa(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void irCreadores(View view){
        Intent i = new Intent(this, creadoresActivity.class);
        startActivity(i);
    }

    public void irScanner(View view){
        Intent i = new Intent(this, scannerActivity4.class);
        startActivity(i);
    }
}