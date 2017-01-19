package com.example.aimew.staticfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aimew on 18/01/2017.
 */

public class DetailsFragment extends android.app.Fragment {

    public TextView textMovie;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //recibir el nombre de la pelicula
        Bundle bundle = this.getArguments();
        if(bundle != null){
            textMovie.setText(bundle.getString("movieName"));
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        textMovie = (TextView)view.findViewById(R.id.text_movie);

        return view;
    }
}
