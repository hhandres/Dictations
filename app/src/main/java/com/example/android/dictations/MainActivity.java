package com.example.android.dictations;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (savedInstanceState == null) {
            MainMenu fragment = new MainMenu();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.commit();
        }
    }

    // Loads the correct fragment based on the chosen Level and Category
    public void buttonsSelected (View view) {

        // The 5 different levels (Beginner through Level 4)
        RadioButton beginner = (RadioButton) findViewById(R.id.beginner);
        RadioButton level_1 = (RadioButton) findViewById(R.id.level_1);
        RadioButton level_2 = (RadioButton) findViewById(R.id.level_2);
        RadioButton level_3 = (RadioButton) findViewById(R.id.level_3);
        RadioButton level_4 = (RadioButton) findViewById(R.id.level_4);

        // The 3 categories
        RadioButton rhythms = (RadioButton) findViewById(R.id.rhythms);
        RadioButton melodies = (RadioButton) findViewById(R.id.melodies);
        RadioButton progressions = (RadioButton) findViewById(R.id.progressions);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Check the chosen Level and Category and load the correct fragment
        if (beginner.isChecked() && rhythms.isChecked()) {
            BeginnerRhythm fragment = new BeginnerRhythm();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (beginner.isChecked() && melodies.isChecked()) {
            BeginnerMelody fragment = new BeginnerMelody();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (beginner.isChecked() && progressions.isChecked()) {
            Toast.makeText(getApplicationContext(), "Sorry, Chord Progressions are only available for Levels 1, 2, 3, and 4", Toast.LENGTH_LONG).show();

        } else if (level_1.isChecked() && rhythms.isChecked()) {
            Level1Rhythm fragment = new Level1Rhythm();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_1.isChecked() && melodies.isChecked()) {
            Level1Melody fragment = new Level1Melody();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_1.isChecked() && progressions.isChecked()) {
            Level1Harmony fragment = new Level1Harmony();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_2.isChecked() && rhythms.isChecked()) {
            Level2Rhythm fragment = new Level2Rhythm();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_2.isChecked() && melodies.isChecked()) {
            Level2Melody fragment = new Level2Melody();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_2.isChecked() && progressions.isChecked()) {
            Level2Harmony fragment = new Level2Harmony();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_3.isChecked() && rhythms.isChecked()) {
            Level3Rhythm fragment = new Level3Rhythm();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_3.isChecked() && melodies.isChecked()) {
            Level3Melody fragment = new Level3Melody();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_3.isChecked() && progressions.isChecked()) {
            Level3Harmony fragment = new Level3Harmony();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_4.isChecked() && rhythms.isChecked()) {
            Level4Rhythm fragment = new Level4Rhythm();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_4.isChecked() && melodies.isChecked()) {
            Level4Melody fragment = new Level4Melody();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (level_4.isChecked() && progressions.isChecked()) {
            Level4Harmony fragment = new Level4Harmony();
            fragmentTransaction.replace(R.id.root_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else {
            Toast.makeText(getApplicationContext(), "Please choose both a level and a category", Toast.LENGTH_LONG).show();
        }
    }



    public void dictationChosen (View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SharedPreferences.Editor ed = getSharedPreferences("switchState", MODE_PRIVATE).edit();
        Bundle bundle = new Bundle();

        // Get the last part of the switchID and use it to create the URLs for the dictations and the audio file
        Switch switchButton = (Switch) findViewById(view.getId());
        String rawId = getResources().getResourceName(view.getId());
        String [] splitId = rawId.split("/", 2);
        String id = splitId[1];

        // Store switch state into SharedPreferences
        if (switchButton.isChecked()) {
            ed.putBoolean(id, true);
            ed.apply();
        } else {
            ed.putBoolean(id, false);
            ed.apply();
        }

        // Store the URL of the dictation and audio file into the bundle
        bundle.putString("pdfLink", "https://docs.google.com/gview?embedded=true&url=http://sites.msudenver.edu/handres/wp-content/uploads/sites/387/2017/04/" + id.toUpperCase() + ".pdf");
        bundle.putString("audioLink", "http://sites.msudenver.edu/handres/wp-content/uploads/sites/387/2017/04/" + id.toUpperCase() + ".mp3");

        // Load the Dictation Template Fragment which will open the correct dictation in the webview based on the bundled URLs
        DictationTemplate fragment = new DictationTemplate();
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.root_layout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
