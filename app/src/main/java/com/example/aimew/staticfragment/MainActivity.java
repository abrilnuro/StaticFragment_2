package com.example.aimew.staticfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Point;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MovieListFragment.OnHeadlineSelectedListener{

    FragmentCommunicator fragmentCommunicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtener el nombre de la pelicula seleccionada de primer fragmento
        /*Intent intent = getIntent();
        String movie = intent.getStringExtra("movie");
        Toast.makeText(this, movie, Toast.LENGTH_LONG).show();*/

        //mostrar el nombre de la pelicula en el segundo fragmento
        /*Bundle arguments = new Bundle();
        arguments.putString("movieName", movie);
        DetailsFragment fragment = DetailsFragment.newInstance(arguments);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content, fragment, DetailsFragment.TAG);
        ft.commit();*/

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


    @Override
    public void onArticleSelected(String movie) {
        //mandar el nombre de la pelicula al segundo fragmento
        Toast.makeText(this, movie, Toast.LENGTH_LONG).show();

        if(fragmentCommunicator != null)
            fragmentCommunicator.passDataToFragment(movie);

    }
}
