package com.example.mentalhealthguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CBTOverview extends Fragment {


    public CBTOverview() {
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cbtoverview, container, false);

        /*Button btn = (Button) getView().findViewById(R.id.btnDistort);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new cogdist());*//*
            }
        });*/

        /*public Button btnDistort;

    public void init() {
        btnDistort = (Button)view.findViewById(R.id.btnDistort);

        btnDistort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CBTOverview.this,CogDistort.class);
            }
        });

        init();*/


        return view;
    }

}
