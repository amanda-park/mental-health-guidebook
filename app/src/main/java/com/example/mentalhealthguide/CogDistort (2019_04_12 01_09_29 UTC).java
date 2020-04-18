package com.example.mentalhealthguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CogDistort extends AppCompatActivity {

    /*public Button btnDistort;

    public void init() {
        btnDistort = (Button)findViewById(R.id.btnDistort);

        btnDistort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CogDistort.this,CBTOverview.class);
            }
        });*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cog_distort);
        // init();
    }
}
