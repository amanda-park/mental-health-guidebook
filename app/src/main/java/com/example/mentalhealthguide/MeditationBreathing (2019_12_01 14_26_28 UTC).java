package com.example.mentalhealthguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MeditationBreathing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_breathing);
        TextView textView = findViewById(R.id.textView4);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
