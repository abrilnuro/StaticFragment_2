package com.example.aimew.staticfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by aimew on 18/01/2017.
 */

public class DetailsFragment extends android.app.Fragment implements FragmentCommunicator{

    public TextView textMovie;
    private String activityAssignedValue ="pelicula";
    FragmentCommunicator mCallback;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflar el view
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        //referenciar los elementos del fragmento
        textMovie = (TextView)view.findViewById(R.id.text_movie);

        return view;
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        context = getActivity();
        ((MainActivity)context).fragmentCommunicator = this;
    }

    @Override
    public void onResume() {
        super.onResume();
        textMovie.setText(activityAssignedValue);
    }

    @Override
    public void passDataToFragment(String someValue){
        activityAssignedValue = someValue;
        textMovie.setText(activityAssignedValue);
    }


}
