package com.example.skyrkov235;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UsersAdapter extends BaseAdapter {
    private List<ListItem> data;
    private LayoutInflater inflater;

    public UsersAdapter(List<ListItem> data, LayoutInflater inflater) {
        this.data = data;
        this.inflater = inflater;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View currentView, ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView number = view.findViewById(R.id.number);
        TextView name = view.findViewById(R.id.name);
        imageView.setImageResource(data.get(i).getAvatarId());
        number.setText(String.valueOf(data.get(i).getNumber()));
        name.setText(data.get(i).getName());
        return view;
    }
}
