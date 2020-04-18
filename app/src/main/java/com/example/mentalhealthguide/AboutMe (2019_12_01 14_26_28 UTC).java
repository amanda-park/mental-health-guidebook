package com.example.mentalhealthguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutMe extends Fragment {
//    private AdView mAdView;

    public AboutMe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about_me, container, false);

        TextView textView = view.findViewById(R.id.textView5);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

//        mAdView = view.findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        return view;
    }

}