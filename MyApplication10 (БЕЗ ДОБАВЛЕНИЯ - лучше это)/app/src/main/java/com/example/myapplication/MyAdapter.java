package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter{
    private List<String> data;
    private LayoutInflater inflater;

    public MyAdapter(List<String> data, Context context) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
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
        View view = inflater.inflate(R.layout.list_item, parent, false);
        TextView number = view.findViewById(R.id.number);
        TextView name = view.findViewById(R.id.name);
        number.setText(String.valueOf(position));
        name.setText(data.get(position));
        return view;
    }
}
