package com.example.proyectodispositivos;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(4.087759, -76.211739);
        LatLng sydney1 = new LatLng(4.068608, -76.214944);
        LatLng sydney2 = new LatLng(4.056695, -76.204302);
        LatLng sydney3 = new LatLng(4.091308, -76.206292);
        LatLng sydney4 = new LatLng(4.080222, -76.175027);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Usted Esta Aqui"));
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Criadero Villa Andrea "));
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Granja Tapias "));
        mMap.addMarker(new MarkerOptions().position(sydney3).title("El Cebu GANADO Y MEDICAMENTOS "));
        mMap.addMarker(new MarkerOptions().position(sydney4).title("Granja el Porvenir Avinsa"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}