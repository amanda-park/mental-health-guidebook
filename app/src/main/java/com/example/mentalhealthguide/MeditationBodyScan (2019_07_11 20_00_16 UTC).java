package com.example.mentalhealthguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MeditationBodyScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_body_scan);
        TextView textView = findViewById(R.id.textView4);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
