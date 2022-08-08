package com.a02283751.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.a02283751.weatherapp.view.DisplayScreenFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container, DisplayScreenFragment.class, null)
                    .commit();
        }
    }
}