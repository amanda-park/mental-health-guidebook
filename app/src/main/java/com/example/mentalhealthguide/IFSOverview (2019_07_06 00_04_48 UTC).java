package com.example.mentalhealthguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class IFSOverview extends Fragment {


    public IFSOverview() {
        // Required empty public constructor
    }



    private Button button1;
//    private Button button2;
//    private Button button3;
//    private Button button4;
//    private Button button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ifsoverview, container, false);

        //button1 = view.findViewById(R.id.button20);
//    button2 = view.findViewById(R.id.button5);
//    button3 = view.findViewById(R.id.button6);
//    button4 = view.findViewById(R.id.button);
//    button5 = view.findViewById(R.id.button2);



        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), CognitiveDefusion.class);
                startActivity(intent);
            }
        });*/

//        button2.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.i("AntiProcrastination", "Will this stupid button work?");
//            Intent intent2 = new Intent(getActivity(), Mistrust.class);
//            startActivity(intent2);
//        }
//    });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.i("Whys", "Will this stupid button work?");
//            Intent intent3 = new Intent(getActivity(), EmotionalDeprivation.class);
//            startActivity(intent3);
//        }
//    });
//
//        button4.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.i("CogDistort", "Will this stupid button work?");
//            // openCogAct();
//            Intent intent = new Intent(getActivity(), Defectiveness.class);
//            startActivity(intent);
//        }
//    });
//
//        button5.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.i("AntiProcrastination", "Will this stupid button work?");
//            Intent intent2 = new Intent(getActivity(), SocialIsolation.class);
//            startActivity(intent2);
//        }
//    });

        return view;
    }

}
