package com.example.student.appbasketball;


import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements OnMapReadyCallback,LocationListener {


    GoogleMap mMap;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);  // inflater 充氣機  inflate 充氣

        return v;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment=(SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);

    }





    @Override
    public void onMapReady(GoogleMap googleMap){




        LatLngBounds a1 = new LatLngBounds(
                new LatLng(24.99, 121.48), new LatLng(25.15, 121.6));

        mMap = googleMap;

        LatLng m1 = new LatLng(25.131402, 121.504126);
        mMap.addMarker(new MarkerOptions().position(m1).title("大豐公園地下停車場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m2 = new LatLng(25.126699, 121.510914);
        mMap.addMarker(new MarkerOptions().position(m2).title("丹鳳公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m3 = new LatLng(25.119832, 121.514042);
        mMap.addMarker(new MarkerOptions().position(m3).title("陽明大學山下籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m4 = new LatLng(25.116467, 121.509788);
        mMap.addMarker(new MarkerOptions().position(m4).title("北投運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m5 = new LatLng(25.110262, 121.521545);
        mMap.addMarker(new MarkerOptions().position(m5).title("榮華公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m6 = new LatLng(25.113151, 121.532440);
        mMap.addMarker(new MarkerOptions().position(m6).title("天母運動公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m7 = new LatLng(25.100963, 121.541353);
        mMap.addMarker(new MarkerOptions().position(m7).title("臺灣神學院籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m8 = new LatLng(25.097462, 121.518770);
        mMap.addMarker(new MarkerOptions().position(m8).title("美崙公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m9 = new LatLng(25.093379, 121.509687);
        mMap.addMarker(new MarkerOptions().position(m9).title("社子籃球場 ").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m10 = new LatLng(25.091173, 121.506779);
        mMap.addMarker(new MarkerOptions().position(m10).title("社子公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m11 = new LatLng(25.113604, 121.534679);
        mMap.addMarker(new MarkerOptions().position(m11).title("天母運動公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m12 = new LatLng(25.091235, 121.514262);
        mMap.addMarker(new MarkerOptions().position(m12).title("百齡右岸河濱公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m13 = new LatLng(25.081121, 121.516992);
        mMap.addMarker(new MarkerOptions().position(m13).title("三腳渡籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m14 = new LatLng(25.084595, 121.544680);
        mMap.addMarker(new MarkerOptions()
                .position(m14)
                .snippet("中山區  室內/室外")
                .title("實踐大學籃球場")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m15 = new LatLng(25.075196, 121.560777);
        mMap.addMarker(new MarkerOptions().position(m15).title("美堤河濱公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m16 = new LatLng(25.078155, 121.575215);
        mMap.addMarker(new MarkerOptions().position(m16).title("內湖運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m17 = new LatLng(25.063439, 121.591966);
        mMap.addMarker(new MarkerOptions().position(m17).title("石潭公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m18 = new LatLng(25.086257, 121.605345);
        mMap.addMarker(new MarkerOptions().position(m18).title("大湖山莊籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m19 = new LatLng(25.050806, 121.493188);
        mMap.addMarker(new MarkerOptions().position(m19).title("中興橋下籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m20 = new LatLng(25.053867, 121.506702);
        mMap.addMarker(new MarkerOptions().position(m20).title("延平籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m21 = new LatLng(25.065249, 121.516440);
        mMap.addMarker(new MarkerOptions().position(m21).title("大同運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m22 = new LatLng(25.075012, 121.510476);
        mMap.addMarker(new MarkerOptions().position(m22).title("迪化休閒運動公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m23 = new LatLng(25.072409, 121.510036);
        mMap.addMarker(new MarkerOptions().position(m23).title("迪化污水處理廠").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m24 = new LatLng(25.068554, 121.532690);
        mMap.addMarker(new MarkerOptions().position(m24).title("新生公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m25 = new LatLng(25.054842, 121.521464);
        mMap.addMarker(new MarkerOptions().position(m25).title("中山運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m26 = new LatLng(25.048283, 121.521603);
        mMap.addMarker(new MarkerOptions().position(m26).title("華山公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m27 = new LatLng(25.048111, 121.524590);
        mMap.addMarker(new MarkerOptions().position(m27).title("市民林森路口籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m28 = new LatLng(25.045105, 121.530422);
        mMap.addMarker(new MarkerOptions().position(m28).title("新生橋籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m29 = new LatLng(25.043285, 121.522979);
        mMap.addMarker(new MarkerOptions().position(m29).title("成功高中運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m30 = new LatLng(25.045991, 121.540104);
        mMap.addMarker(new MarkerOptions().position(m30).title("中油中崙球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m31 = new LatLng(25.049564, 121.551383);
        mMap.addMarker(new MarkerOptions().position(m31).title("臺北田徑場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m32 = new LatLng(25.049338, 121.541494);
        mMap.addMarker(new MarkerOptions().position(m32).title("朱崙公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m33 = new LatLng(25.055499, 121.565795);
        mMap.addMarker(new MarkerOptions().position(m33).title("西松高中籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m34 = new LatLng(25.062084, 121.558827);
        mMap.addMarker(new MarkerOptions().position(m34).title("民權公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m35 = new LatLng(25.062562, 121.571762);
        mMap.addMarker(new MarkerOptions().position(m35).title("彩虹河濱公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m36 = new LatLng(25.058788, 121.569838);
        mMap.addMarker(new MarkerOptions().position(m36).title("五濱籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m37 = new LatLng(25.031692, 121.535924);
        mMap.addMarker(new MarkerOptions().position(m37).title("大安森林公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m38 = new LatLng(25.053433, 121.574595);
        mMap.addMarker(new MarkerOptions().position(m38).title("麥帥一橋籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m39 = new LatLng(25.040379, 121.541247);
        mMap.addMarker(new MarkerOptions().position(m39).title("懷生國中籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m40 = new LatLng(25.016525, 121.492395);
        mMap.addMarker(new MarkerOptions().position(m40).title("華中籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m41 = new LatLng(25.021040, 121.505126);
        mMap.addMarker(new MarkerOptions().position(m41).title("青年公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m42 = new LatLng(25.023457, 121.513121);
        mMap.addMarker(new MarkerOptions().position(m42).title("中正河濱公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m43 = new LatLng(25.014484, 121.525610);
        mMap.addMarker(new MarkerOptions().position(m43).title("古亭河濱公園籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m44 = new LatLng(25.020174, 121.536438);
        mMap.addMarker(new MarkerOptions().position(m44).title("臺大中央籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));


        LatLng m45 = new LatLng(25.018902, 121.534162);
        mMap.addMarker(new MarkerOptions().position(m45).title("臺大新生籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m46 = new LatLng(25.021663, 121.535299);
        mMap.addMarker(new MarkerOptions().position(m46).title("臺大綜合體育館籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m47 = new LatLng(25.032566, 121.561618);
        mMap.addMarker(new MarkerOptions().position(m47).title("Adidas101球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m48 = new LatLng(25.030389, 121.569983);
        mMap.addMarker(new MarkerOptions().position(m48).title("中強公園").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m49 = new LatLng(25.024435, 121.561271);
        mMap.addMarker(new MarkerOptions().position(m49).title("台北醫學大學籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m50 = new LatLng(25.023246, 121.545119);
        mMap.addMarker(new MarkerOptions().position(m50).title("國北教大籃球場").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m51 = new LatLng(25.021364, 121.545294);
        mMap.addMarker(new MarkerOptions().position(m51).title("臺北和平籃球館").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));

        LatLng m52 = new LatLng(25.089325, 121.521487);
        mMap.addMarker(new MarkerOptions().position(m52).title("士林運動中心").icon(BitmapDescriptorFactory.fromResource(R.drawable.balllocationldpi)));




        /*
        for (int i=0;i<;i++){
            LatLng m=new LatLng(a[i],b[i]);
            mMap.addMarker(new MarkerOptions().position(m).title(tt[i]));
            mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.basketballmdpi)));

        }
        */


       /*
        LatLng[] a = new LatLng[19];
        for (int i=0 ; i<a.length ; i++){
           Marker mark=mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.basketballmdpi)));
        }
        */


        mMap.moveCamera(CameraUpdateFactory.newLatLng(m1));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(a1.getCenter(), 12));

    }


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}


