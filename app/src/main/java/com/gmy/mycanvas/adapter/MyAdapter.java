package com.gmy.mycanvas.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.gmy.mycanvas.R;

import java.util.List;

public class MyAdapter  extends BaseAdapter {
    private static final String TAG = "MyAdapter";
    private List<String> mList;
    private Context mContext;

    public MyAdapter(List<String> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return this.mList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String title = mList.get(position);
        ViewHolder viewHolder;
        if(convertView == null ){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_list, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.myTV = convertView.findViewById(R.id.item_titlt_tv);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.myTV.setText(title);

        return convertView;
    }

    class ViewHolder{
        TextView myTV;
    }
}
