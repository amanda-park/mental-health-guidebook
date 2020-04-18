package com.example.mentalhealthguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Opening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        TextView textView = findViewById(R.id.textView5);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
