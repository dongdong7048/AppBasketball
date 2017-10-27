package com.example.student.appbasketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapListView extends AppCompatActivity {

    TextView tv;
    ListView lv;
    String[] balls;
    ArrayList<float[]> latlng = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        tv = (TextView) findViewById(R.id.textView);
        lv = (ListView) findViewById(R.id.listView);
        balls = getResources().getStringArray(R.array.balls);

        //做好經緯度傳進latlng
        String[] s = getResources().getStringArray(R.array.latlng);
        for (String str : s) {
            String[] token = str.split(",");
            float f[] = new float[2];
            f[0] = Float.parseFloat(token[0]);
            f[1] = Float.parseFloat(token[1]);
            latlng.add(f);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                balls
        );
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                float[] ff = latlng.get(i);
                /*
                LatLng m = new LatLng(ff[0], ff[1]);
                mMap.addMarker(new MarkerOptions().position(m).title(balls[i]).icon(BitmapDescriptorFactory.fromResource(R.drawable.ball)));
*/

            }
        });


//        lv.setOnItemClickListener(new ListView.OnItemClickListener(){
//
//            public void onItemclick(AdapterView<?> arg0 , View arg1 , int arg2 , long arg3){
//
//            }
//        }
    }
}
