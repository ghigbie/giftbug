package com.geogehigbie.giftbug;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import layout.PersonIntro;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadIntroPage();

        //fragmentInitialize();
    }

    public void loadIntroPage(){
        Button getStarted = (Button) findViewById(R.id.get_started);

        getStarted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                fragmentInitialize();
            }
        });
    }

    public void fragmentInitialize(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new PersonIntro());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


}
