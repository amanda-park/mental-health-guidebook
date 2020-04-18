package com.example.mentalhealthguide;

import android.os.Bundle;

import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatDelegate;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.Random;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private Button MyButton;
    //private Switch darkSwitch;
    //private Button button1;

    int selector;
    private Button quoteButton;
    private long backPressedTime;
    // List of random quotes
    ArrayList<String> listOfRandomQuotes = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This sets up ads for AdMob
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        /*MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });*/


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /*<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <com.google.android.gms.ads.AdView
        android:id="@+id/adView"
        xmlns:ads="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_alignParentBottom="true"
        ads:adSize="BANNER"
        ads:adUnitId="ca-app-pub-3940256099942544/6300978111" />
    </LinearLayout>*/

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_Welcome));

        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show start activity

            startActivity(new Intent(MainActivity.this, Opening.class));
            Toast.makeText(MainActivity.this, "First Run", Toast.LENGTH_LONG)
                    .show();
        }

        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();

        listOfRandomQuotes = new ArrayList<String>();
        listOfRandomQuotes.add("Are you currently hydrated?");
        listOfRandomQuotes.add("Have you gone for a walk today?");
        listOfRandomQuotes.add("Have you stretched and moved your body recently?");
        listOfRandomQuotes.add("Did you take your medications today?");
        listOfRandomQuotes.add("Have you eaten something nutritious in the last 3 hours?");
        listOfRandomQuotes.add("Have you said or done something nice for someone else this week?");
        listOfRandomQuotes.add("Have you reached out to your friends and family for a chat or outing this week?");
        listOfRandomQuotes.add("Have you made time to do the things you enjoy doing?");
        listOfRandomQuotes.add("Have you said something gentle and loving to yourself in the last hour?");
        listOfRandomQuotes.add("Have you addressed or dealt with any nagging thoughts or feelings?");
        listOfRandomQuotes.add("Did you get at least 7 hours of sleep last night?");
        listOfRandomQuotes.add("How do you feel after using social media?");
        listOfRandomQuotes.add("When do you find yourself picking up your phone? How do you feel when you do?");
        listOfRandomQuotes.add("Take a few deep breaths into your belly.");
        listOfRandomQuotes.add("Tell someone you love them.");
        listOfRandomQuotes.add("Why not Zoidberg?");

        quoteButton = (Button) findViewById(R.id.quoteBubble);

   }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //super.onBackPressed();

            if (backPressedTime + 2000 > System.currentTimeMillis()) {
               super.onBackPressed();
               return;
            }
            else {
                Toast.makeText(getBaseContext(), "Press back again to exit the app", Toast.LENGTH_SHORT).show();
            }
            backPressedTime = System.currentTimeMillis();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

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
//
        if (id == R.id.quoteBubble) {
            Random randomNumber = new Random();
            selector = randomNumber.nextInt(5);
            Toast.makeText(this, listOfRandomQuotes.get(selector), Toast.LENGTH_LONG).show();
        return true;
        }

//        if (id == R.id.action_settings) {
//            setTitle("Settings");
//            Settings fragment = new Settings();
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.frame, fragment, "Settings");
//            fragmentTransaction.commit();
//        }

       if (id == R.id.share) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBody = "Nifty Mental Health App!";
            String shareSub = "Hey, I found this really cool application on the Google Play store called the Mental Health Guide and thought you might like to check it out!";
            intent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
            intent.putExtra(Intent.EXTRA_TEXT, shareSub);
            startActivity(Intent.createChooser(intent, "Share using"));
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
