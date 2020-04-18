package com.example.mentalhealthguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class CBTOverview extends Fragment {


    public CBTOverview() {
        // Required empty public constructor
    }

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cbtoverview, container, false);

        button1 = view.findViewById(R.id.button4);
        button2 = view.findViewById(R.id.button5);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button6);
        button5 = view.findViewById(R.id.button7);
        button6 = view.findViewById(R.id.button8);
        button7 = view.findViewById(R.id.button9);
        button8 = view.findViewById(R.id.button10);
        button9 = view.findViewById(R.id.button11);
        button10 = view.findViewById(R.id.button12);

        TextView textView = view.findViewById(R.id.textView5);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


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

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), CognitiveReframing.class);
                startActivity(intent3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), VisualizingSuccess.class);
                startActivity(intent3);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), CountWhatCounts.class);
                startActivity(intent3);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), TestCants.class);
                startActivity(intent3);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), EmotionalAccounting.class);
                startActivity(intent3);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), FacingFears.class);
                startActivity(intent3);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), ApprovalAddiction.class);
                startActivity(intent3);
            }
        });

        return view;
    }

}
