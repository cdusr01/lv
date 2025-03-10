package com.example.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.listview.databinding.ActivityMainBinding;
import com.example.listview.databinding.ListItemBinding;

//public class MyAdapter extends BaseAdapter {
//    private List<ListItem> data;
//    private LayoutInflater inflater;
//
//    public MyAdapter(Context context, List<ListItem> data) {
//        this.inflater = LayoutInflater.from(context);
//        this.data = data;
//    }
//
//    @Override
//    public int getCount() {
//        return data.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View view = inflater.inflate(R.layout.list_item, parent, false);
//        TextView number = view.findViewById(R.id.number);
//        TextView name = view.findViewById(R.id.name);
//        ImageView imageView = view.findViewById(R.id.image);
//        number.setText(String.valueOf(position));
//        name.setText(data.get(position).getName());
//        imageView.setImageResource(data.get(position).getAvatarId());
//        return view;
//    }
//}

public class MyAdapter extends BaseAdapter{
    private List<ListItem> data;
    private LayoutInflater inflater;

    public MyAdapter(List<ListItem> data, Context context) {
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
        ImageView imageView = view.findViewById(R.id.image);
        number.setText(String.valueOf(position));
        name.setText(data.get(position).getName());
        imageView.setImageResource(data.get(position).getAvatarId());
        return view;
    }
}
