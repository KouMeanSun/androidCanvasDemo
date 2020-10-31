package com.gmy.mycanvas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmy.mycanvas.R;
import com.gmy.mycanvas.view.CoordinateSystemView;

public class CoordinateSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate_system);
        CoordinateSystemView customView = new CoordinateSystemView(this);
        setContentView(customView);
    }
}