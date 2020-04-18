package com.example.mentalhealthguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DBTOverview extends Fragment {

    public DBTOverview() {
        // Required empty public constructor
    }

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dbtoverview, container, false);

        button1 = view.findViewById(R.id.button21);
        button2 = view.findViewById(R.id.button23);
        button3 = view.findViewById(R.id.button22);

        TextView textView = view.findViewById(R.id.textView5);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), InterpersonalEffectiveness.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("AntiProcrastination", "Will this stupid button work?");
            Intent intent2 = new Intent(getActivity(), DistressTolerance.class);
            startActivity(intent2);
        }
    });

        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("Whys", "Will this stupid button work?");
            Intent intent3 = new Intent(getActivity(), EmotionalRegulation.class);
            startActivity(intent3);
        }
    });

        return view;
    }

}
