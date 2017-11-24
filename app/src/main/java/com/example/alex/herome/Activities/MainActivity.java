package com.example.alex.herome.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alex.herome.R;
import com.example.alex.herome.fragments.BackstoryFragment;
import com.example.alex.herome.fragments.MainFragment;
import com.example.alex.herome.fragments.PickPowerFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, PickPowerFragment.PickPowerInteractionListener, BackstoryFragment.BackstoryInteractionListener{

    public String POWER_ORIGIN = "came by accident";
    public String POWER_SELECTED = "flight";
    public String SECONDARY_POWER = "strength";
    public String ACTUAL_POWER = "flight";
    public String HERO_NAME = "Ultraman";
    public int PRIMARY_POWER_IMG = 0;
    public int SECONDARY_POWER_IMG = 0;
    public int HERO_IMG = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null){

            // checks to see if fragment is null because when 1st loaded it WILL BE
            fragment = new MainFragment();

            // for fragments have to begin transactions and then commit

            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();
        }


    }

    public void loadMainScreen () {

        MainFragment mainFragment = new MainFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mainFragment).addToBackStack(null).commit();

    }

    public void loadPickPowerScreen(){
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();

    }

    public void loadBackStoryScreen() {
        BackstoryFragment backstoryFragment = new BackstoryFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, backstoryFragment).addToBackStack(null).commit();
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }

    @Override
    public void onBackstoryFragmentInteraction(Uri uri) {

    }
}
