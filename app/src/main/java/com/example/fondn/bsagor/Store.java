package com.example.fondn.bsagor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Store extends BaseAdapter{
    //String[] name;
    ArrayList<AA> name;
    Context context;
    private static LayoutInflater inflater = null;

    public Store(ArrayList<AA> name, MainActivity c) {
        this.name = name;

        context = c;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // Friend friend = friendList.get(position);
        AA a = name.get(position);
        TextView tv;

        convertView = inflater.inflate(R.layout.layout,null);
        tv = (TextView) convertView.findViewById(R.id.textView2LID);



        tv.setText(a.getN());


        return convertView;
    }
}
