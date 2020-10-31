package com.gmy.mycanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gmy.mycanvas.activity.ARGBActivity;
import com.gmy.mycanvas.activity.CoordinateSystemActivity;
import com.gmy.mycanvas.activity.DrawArcActivity;
import com.gmy.mycanvas.activity.DrawBitmapActivity;
import com.gmy.mycanvas.activity.DrawCircleActivity;
import com.gmy.mycanvas.activity.DrawLineActivity;
import com.gmy.mycanvas.activity.DrawOvalViewActivity;
import com.gmy.mycanvas.activity.DrawPathActivity;
import com.gmy.mycanvas.activity.DrawPointActivity;
import com.gmy.mycanvas.activity.DrawRectActivity;
import com.gmy.mycanvas.activity.MyTextActivity;
import com.gmy.mycanvas.adapter.MyAdapter;
import com.gmy.mycanvas.view.CoordinateSystemView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String  TAG = "MainActivity";
    private Context mContext;
    private ListView mListView;
    private MyAdapter mAdapter;
    private List<String> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.commonInit();
    }

    private void commonInit(){
        this.mContext = this;
        mList = new ArrayList<>();
        mList.add("绘制坐标系");
        mList.add("drawARGB");
        mList.add("drawText");
        mList.add("drawPoint");
        mList.add("drawLine");
        mList.add("drawRect");
        mList.add("drawCircle");
        mList.add("drawOval");
        mList.add("drawArc");
        mList.add("drawPath");
        mList.add("drawBitmap");

        this.initViews();
    }

    private void initViews(){
        this.mListView = this.findViewById(R.id.my_list_lv);
        this.mAdapter = new MyAdapter(mList,mContext);
        this.mListView.setAdapter(mAdapter);
        this.mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG,"canvas 点击了 "+mList.get(position));
        if(position == 0){
            Intent intent = new Intent(this, CoordinateSystemActivity.class);
            startActivity(intent);
        }else if(position == 1){
            Intent intent = new Intent(this, ARGBActivity.class);
            startActivity(intent);
        }else if(position == 2){
            Intent intent = new Intent(this, MyTextActivity.class);
            startActivity(intent);
        }else if(position == 3){
            Intent intent = new Intent(this, DrawPointActivity.class);
            startActivity(intent);
        }else if(position == 4){
            Intent intent = new Intent(this, DrawLineActivity.class);
            startActivity(intent);
        }else if(position == 5){
            Intent intent = new Intent(this, DrawRectActivity.class);
            startActivity(intent);
        }else if(position == 6){
            Intent intent = new Intent(this, DrawCircleActivity.class);
            startActivity(intent);
        }else if(position == 7){
            Intent intent = new Intent(this, DrawOvalViewActivity.class);
            startActivity(intent);
        }else if(position == 8){
            Intent intent = new Intent(this, DrawArcActivity.class);
            startActivity(intent);
        }else if(position == 9){
            Intent intent = new Intent(this, DrawPathActivity.class);
            startActivity(intent);
        }else if(position == 10){
            Intent intent = new Intent(this, DrawBitmapActivity.class);
            startActivity(intent);
        }
    }
}