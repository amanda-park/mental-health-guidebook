package com.example.mentalhealthguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewCBT extends Fragment {


    public OverviewCBT() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // View v = inflater.inflate(R.layout.fragment_overview_cbt,container,false);
        /*Button btn = findViewById(R.id.btnDistort);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.click((Button) view);
            }
        });*/
        return inflater.inflate(R.layout.fragment_overview_cbt, container, false);

    }


}
