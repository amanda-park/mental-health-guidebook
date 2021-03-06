package com.example.mentalhealthguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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

    private Button button1;
    private Button button2;
    private Button button3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cbtoverview, container, false);

        button1 = view.findViewById(R.id.button4);
        button2 = view.findViewById(R.id.button5);
        button3 = view.findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), CogDistort.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), AntiProcrastination.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), whys.class);
                startActivity(intent3);
            }
        });

        return view;
    }
   public void openCogAct() {
        Intent intent = new Intent(getActivity(), CogDistort.class);
        startActivity(intent);
    }
    public void openAntiPro() {
        Intent intent = new Intent(getActivity(), AntiProcrastination.class);
        startActivity(intent);
    }
}
