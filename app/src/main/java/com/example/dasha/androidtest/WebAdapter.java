package com.example.dasha.androidtest;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by dasha on 20/07/16.
 */
public class WebAdapter  extends BaseAdapter{
    ArrayList<String> websites;
    Context context;

    public WebAdapter(Context context, ArrayList<String> websites) {
        this.websites = websites;
        this.context = context;
    }

    @Override
    public int getCount() {
        return websites.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText(websites.get(position));
        tv.setTextColor(Color.BLACK);
        return tv;
    }

}