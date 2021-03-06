package com.example.mentalhealthguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatDelegate;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Switch darkSwitch;

    //private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
//
//        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES) {
//            setTheme(R.style.darkTheme);
//        }
//        else setTheme(R.style.AppTheme);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
//
//        switch (item.getItemId()) {
//            case R.id.darkMode:
//                return true;
//            case R.id.action_settings:
//
//                return true;
//            case R.id.action_about:
//                return true;
//            default:
//                break;
//        }

        //noinspection SimplifiableIfStatement

//        if (id == R.id.darkmode) {
//            Toast.makeText(this, "Dark Mode", Toast.LENGTH_SHORT).show();
//            if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES) {
//                setTheme(R.style.darkTheme);
//            }
//            else setTheme(R.style.AppTheme);

//            darkSwitch = (Switch)findViewById(R.id.darkmode);
//            if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES) {
//                darkSwitch.setChecked(true);
//            }

//            darkSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                    if (isChecked) {
//                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                        restartApp();
//                    }
//                    else {
//                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                        restartApp();
//                    }
//                }
//            });
//            return true;
//        }

        if (id == R.id.action_settings) {
            setTitle("Settings");
            Settings fragment = new Settings();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "Settings");
            fragmentTransaction.commit();
        }

        if (id == R.id.action_about) {
            setTitle("About Me");
            AboutMe fragment = new AboutMe();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "AboutMe");
            fragmentTransaction.commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Welcome) {
            setTitle("Welcome");
            Welcome fragment = new Welcome();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "Welcome");
            fragmentTransaction.commit();

            //Therapies in Alphabetical Order

        } else if (id == R.id.nav_ACT) {
            setTitle("ACT");
            ACTOverview fragment = new ACTOverview();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "ACTOverview");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_CBT) {
            setTitle("CBT");
            CBTOverview fragment = new CBTOverview();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "CBTOverview");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_DBT) {
            setTitle("DBT");
            DBTOverview fragment = new DBTOverview();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "DBTOverview");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_EMDR) {
            setTitle("EMDR");
            EMDR fragment = new EMDR();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "EMDR");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_IFS) {
            setTitle("IFS");
            IFSOverview fragment = new IFSOverview();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "IFSOverview");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_MBSR) {
            setTitle("MBSR");
            MBSROverview fragment = new MBSROverview();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "MBSROverview");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_Schemas) {
            setTitle("Schemas");
            Schemas fragment = new Schemas();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "Schemas");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_EmotionalFirstAid) {
            setTitle("Emotional First Aid");
            EmotionalFirstAid fragment = new EmotionalFirstAid();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "EmotionalFirstAid");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_Habits) {
            setTitle("Habits");
            Habits fragment = new Habits();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "Habits");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_References) {
            setTitle("References");
            References fragment = new References();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment, "References");
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putBoolean("MyBoolean", true);
        savedInstanceState.putDouble("myDouble", 1.9);
        savedInstanceState.putInt("MyInt", 1);
        savedInstanceState.putString("MyString", "Welcome back to Android");
        // etc.
    }
}
