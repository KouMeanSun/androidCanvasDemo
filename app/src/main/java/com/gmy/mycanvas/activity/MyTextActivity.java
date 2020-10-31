package com.gmy.mycanvas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmy.mycanvas.R;
import com.gmy.mycanvas.view.MyTextView;

public class MyTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_text);
        MyTextView customView = new MyTextView(this);

        setContentView(customView);
    }
}