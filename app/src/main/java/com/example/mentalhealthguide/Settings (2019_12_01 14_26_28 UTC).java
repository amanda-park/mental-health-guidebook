package com.example.mentalhealthguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatDelegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Settings extends Fragment {

private Button darkModeButton;

    public Settings() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);


//        TextView textView = view.findViewById(R.id.textView5);
//        textView.setClickable(true);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());

        return view;

    }

}