package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());

        data = createList();
        ListView list = binding.listView;

    }
    private List<String> createList() {
        return new Random().doubles(25, 0, 1000)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }

}
