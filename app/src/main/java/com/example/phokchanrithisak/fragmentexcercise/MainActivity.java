package com.example.phokchanrithisak.fragmentexcercise;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFragment (View view){
        Fragment framen;
        if (view == findViewById(R.id.button1)){
            framen = new FragmentOne();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragSite, framen);
            ft.commit();
        }
        else if(view == findViewById(R.id.button2)){
            framen = new FragmentTwo();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragSite, framen);
            ft.commit();
        }
    }
}
