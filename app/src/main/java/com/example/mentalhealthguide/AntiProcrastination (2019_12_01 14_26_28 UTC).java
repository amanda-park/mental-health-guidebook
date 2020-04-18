package com.example.mentalhealthguide;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AntiProcrastination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_procrastination);
        TextView textView = findViewById(R.id.textView4);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
