package com.example.proyectodispositivos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;

    private Button login;
    private Button registrar;
    private Button cerrarSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void irMenu (View view){
        if(auth.getCurrentUser()!= null) {
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);;
        }else{
            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Debes registrarte o inicar sesión para acceder a las demas Funcionalidades");
            builder1.setCancelable(true);
            builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert1 = builder1.create();
            alert1.show();
        }
    }
  //  public void irMenu(View view){
       // Intent i = new Intent(this, MenuActivity.class);
    //    startActivity(i);
  //  }

    public void cerrarSesion(View view){
        auth.signOut();
        if(auth.getCurrentUser() == null){
            login.setVisibility(View.VISIBLE);
            registrar.setVisibility(View.VISIBLE);
            cerrarSesion.setVisibility(View.GONE);

        }

    }

    public void irLibros (View view){
        if(auth.getCurrentUser()!= null) {
            Intent i = new Intent(this, LibrosActivity2.class);
            startActivity(i);;
        }else{
            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
            builder1.setMessage("Debes registrarte o inicar sesión para acceder a ver los libros gratis");
            builder1.setCancelable(true);
            builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });

            AlertDialog alert1 = builder1.create();
            alert1.show();
        }
    }

    public void irNoticias(View view){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://todosobreganado.com/category/noticias-sobre-ganaderia/"));
        startActivity(i);
    }

    public void irConsejos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://todosobreganado.com/category/articulos-sobre-ganaderia/"));
        startActivity(i);
    }


    public void irRazas(View view){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://todosobreganado.com/razas/"));
        startActivity(i);
    }

    public void irTipos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://todosobreganado.com/tipos-de-ganaderia/"));
        startActivity(i);
    }
}