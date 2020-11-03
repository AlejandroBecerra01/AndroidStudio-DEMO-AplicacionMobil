package com.example.proyectodispositivos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class creadoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creadores);
    }

    public void irLinkedln(View view){
        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.linkedin.com/in/alejandro-becerra-barco-/"));
        startActivity(i);
    }
}