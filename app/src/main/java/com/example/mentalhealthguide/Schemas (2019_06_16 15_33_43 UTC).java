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
public class Schemas extends Fragment {


    public Schemas() {
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
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_schemas, container, false);

        button1 = view.findViewById(R.id.button4);
        button2 = view.findViewById(R.id.button5);
        button3 = view.findViewById(R.id.button6);
        button4 = view.findViewById(R.id.button);
        button5 = view.findViewById(R.id.button2);
        button6 = view.findViewById(R.id.button7);
        button7 = view.findViewById(R.id.button8);
        button8 = view.findViewById(R.id.button9);
        button9 = view.findViewById(R.id.button10);
        button10 = view.findViewById(R.id.button11);
        button11 = view.findViewById(R.id.button12);
        button12 = view.findViewById(R.id.button13);
        button13 = view.findViewById(R.id.button14);
        button14 = view.findViewById(R.id.button15);
        button15 = view.findViewById(R.id.button16);
        button16 = view.findViewById(R.id.button17);
        button17 = view.findViewById(R.id.button18);
        button18 = view.findViewById(R.id.button19);
        button19 = view.findViewById(R.id.button20);
        button20 = view.findViewById(R.id.button21);
        button21 = view.findViewById(R.id.button22);
        button22 = view.findViewById(R.id.button23);
        button23 = view.findViewById(R.id.button24);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Abandonment.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), Mistrust.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), EmotionalDeprivation.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Defectiveness.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), SocialIsolation.class);
                startActivity(intent2);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), DependencyIncompetence.class);
                startActivity(intent3);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Enmeshment.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), VulnerabilityHarm.class);
                startActivity(intent2);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), Failure.class);
                startActivity(intent3);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Entitlement.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), InsufficientSelfControl.class);
                startActivity(intent2);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), Subjugation.class);
                startActivity(intent3);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SelfSacrifice.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AntiProcrastination", "Will this stupid button work?");
                Intent intent2 = new Intent(getActivity(), ApprovalSeeking.class);
                startActivity(intent2);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Whys", "Will this stupid button work?");
                Intent intent3 = new Intent(getActivity(), Hypercriticalness.class);
                startActivity(intent3);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Punitiveness.class);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), EmotionalInhibition.class);
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), Negativity.class);
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SchemaHeal.class);
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SchemaTreatment.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SchemaEmotions.class);
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SchemaCopingMode.class);
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CogDistort", "Will this stupid button work?");
                // openCogAct();
                Intent intent = new Intent(getActivity(), SchemaBoundaries.class);
                startActivity(intent);
            }
        });



        return view;
    }

}
