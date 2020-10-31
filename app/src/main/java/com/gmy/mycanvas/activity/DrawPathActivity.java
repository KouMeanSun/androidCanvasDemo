package com.gmy.mycanvas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmy.mycanvas.R;
import com.gmy.mycanvas.view.DrawPathView;

public class DrawPathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_path);
        DrawPathView customView = new DrawPathView(this);
        setContentView(customView);
    }
}