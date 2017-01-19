package com.example.aimew.staticfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aimew on 17/01/2017.
 */

public class MovieListFragment extends android.app.Fragment implements AdapterView.OnItemClickListener{

    private ListView listViewMovie;
    private List<String> movieList;
    private ArrayAdapter<String> movieAdapter;

    //interfaz
    OnHeadlineSelectedListener mCallback;

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(String movie);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnHeadlineSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflar el view
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        //referenciar los elementos del view
        listViewMovie = (ListView)view.findViewById(R.id.listview_movie);
        listViewMovie.setOnItemClickListener(this);

        //crear la lista de peliculas y llearla
        movieList = new ArrayList<String>();
        movieList.add("Constantine");
        movieList.add("Inception");

        //crear el adaptador y asignarlo a la listview
        movieAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, movieList);
        listViewMovie.setAdapter(movieAdapter);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //obtener el nombre de la pelicula
        String movieName = movieList.get(i).toString();

        //mandar el nombre de la pelicula a la clase
        mCallback.onArticleSelected(movieName);
        /*Intent intent = new Intent(getActivity().getBaseContext(),
                MainActivity.class);
        intent.putExtra("movie", movieName);
        getActivity().startActivity(intent);*/
    }
}
