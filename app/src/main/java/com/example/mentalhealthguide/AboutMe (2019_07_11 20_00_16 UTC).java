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
public class AboutMe extends Fragment {


    public AboutMe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about_me, container, false);

//        TextView textView = view.findViewById(R.id.textView5);
//        textView.setClickable(true);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

}