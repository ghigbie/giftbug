package com.geogehigbie.giftbug;

import android.animation.Animator;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import layout.PersonIntro;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerActionBar();
        setOnClickListeners();


    }


    public void fragmentInitialize(){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new PersonIntro());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void beginAnimation(){
        ImageView bug = (ImageView) findViewById(R.id.bug_spinner);
        bug.animate().rotation(360).setDuration(750).start();
        bug.animate().setStartDelay(100).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                fragmentInitialize();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

    }


     public void setOnClickListeners(){

         Button english = (Button) findViewById(R.id.english);
         Button español = (Button) findViewById(R.id.español);

         english.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {
                 beginAnimation();
             }
         });

         español.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {
                 beginAnimation();
             }
         });
    }


    public void centerActionBar(){

        ActionBar actionBar = getActionBar();

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); //this is a soft error
        getSupportActionBar().setCustomView(R.layout.actionbar);

    }



}
