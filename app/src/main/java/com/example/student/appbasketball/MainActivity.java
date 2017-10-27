package com.example.student.appbasketball;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment blankFragment  = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.map1, blankFragment).commit();   // transaction 交易、辦理


    }

    public void click2(View v){
        Intent i = new Intent(MainActivity.this,MapListView.class);
        startActivity(i);
    }


    public void click1(View v){

        Intent b = new Intent(MainActivity.this,MapActivity.class);
        startActivity(b);



    }


}
