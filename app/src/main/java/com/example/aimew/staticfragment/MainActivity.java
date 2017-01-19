package com.example.aimew.staticfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtener el nombre de la pelicula seleccionada de primer fragmento
        Intent intent = getIntent();
        String movie = intent.getStringExtra("movie");
        Toast.makeText(this, movie, Toast.LENGTH_LONG).show();

        //mostrar el nombre de la pelicula en el segundo fragmento
       /* Bundle bundle=new Bundle();
        bundle.putString("movieName", movie);
        //set Fragmentclass Arguments
        DetailsFragment detailsFragment = new DetailsFragment();
        detailsFragment.setArguments(bundle);*/

        /*android.app.FragmentManager fragmentManager = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        WindowManager wm = getWindowManager();

        Display display = wm.getDefaultDisplay();
        Point screenSize = new Point();
        display.getSize(screenSize);

        if(screenSize.x > screenSize.y){
            MovieListFragment movieListFragment = new MovieListFragment();
            fragmentTransaction.replace(android.R.id.content, movieListFragment);
        }else{
            DetailsFragment detailsFragment = new DetailsFragment();
            fragmentTransaction.replace(android.R.id.content, detailsFragment);
        }
        fragmentTransaction.commit();*/

    }
}
