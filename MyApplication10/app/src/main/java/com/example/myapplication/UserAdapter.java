package com.example.myapplication;

import android.app.LauncherActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.databinding.ListItemBinding;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    private List<String> data;
    private LayoutInflater inflater;

    public UserAdapter(List<String> data, LayoutInflater inflater) {
        this.data = data;
        this.inflater = inflater;
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
        TextView text = view.findViewById(R.id.name);
        number.setText(String.valueOf(position));
        text.setText(data.get(position));
        return view;
    }
}
