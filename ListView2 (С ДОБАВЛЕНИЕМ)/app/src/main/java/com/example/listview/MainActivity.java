package com.example.listview;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyAdapter adapter;
    private List<ListItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        data = createList();
        ListView list = binding.listView;
        adapter = new MyAdapter(data, this);
        list.setAdapter(adapter);

    }
    private List<ListItem> createList() {
        List<ListItem> items = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            items.add(ListItem.getListItem());
        }
        return items;
    }

}
