package com.example.android.mymapapp1;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
        import android.os.Bundle;
        import android.util.JsonReader;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
        import com.josie.busrouted.models.BusRoute;
        import com.josie.busrouted.models.Stop;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;
import java.util.Map;
import com.josie.busrouted.models.BusRoute;
import com.josie.busrouted.models.Stop;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
