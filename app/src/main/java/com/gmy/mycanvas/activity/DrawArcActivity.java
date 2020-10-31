package com.gmy.mycanvas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmy.mycanvas.R;
import com.gmy.mycanvas.view.DrawArcView;

public class DrawArcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_arc);
        DrawArcView customView = new DrawArcView(this);
        setContentView(customView);
    }
}