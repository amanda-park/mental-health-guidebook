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
public class EMDR extends Fragment {


    public EMDR() {
        // Required empty public constructor
    }

    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;
    private Button button37;
    private Button button38;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_emdr, container, false);

        button38 = view.findViewById(R.id.button38);
        button32 = view.findViewById(R.id.button32);
        button33 = view.findViewById(R.id.button33);
        button34 = view.findViewById(R.id.button34);
        button35 = view.findViewById(R.id.button35);
        button36 = view.findViewById(R.id.button36);
        button37 = view.findViewById(R.id.button37);

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SafePlace.class);
                startActivity(intent);
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), Container.class);
                startActivity(intent2);
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), SpiralTechnique.class);
                startActivity(intent3);
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), LightStream.class);
                startActivity(intent);
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), Floatback.class);
                startActivity(intent2);
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), ButterflyHug.class);
                startActivity(intent3);
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), AffectScan.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
