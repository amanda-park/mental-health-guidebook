package com.example.mentalhealthguide;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class MBSROverview extends Fragment {


    public MBSROverview() {
        // Required empty public constructor
    }

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mbsroverview, container, false);

        button1 = view.findViewById(R.id.button25);
        button2 = view.findViewById(R.id.button21);
        button3 = view.findViewById(R.id.button23);
        button4 = view.findViewById(R.id.button22);
        button5 = view.findViewById(R.id.button29);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), MeditationBreathing.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), MeditationBodyScan.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), MeditationLovingKindness.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent4 = new Intent(getActivity(), Mindfulness.class);
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent4 = new Intent(getActivity(), traumaMindfulness.class);
                startActivity(intent4);
            }
        });

        return view;
    }

}