package com.example.skyrkov235;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.skyrkov235.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        List<ListItem> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) data.add(ListItem.getListItem());
        LayoutInflater inflater = LayoutInflater.from(this);
        UsersAdapter adapter = new UsersAdapter(data, inflater);
        binding.listView.setAdapter(adapter);

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.add(ListItem.getListItem());
                adapter.notifyDataSetChanged();
            }
        });
        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.clear();
                adapter.notifyDataSetChanged();
            }
        });
        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.size() > 0) {
                    data.remove(data.size() - 1);
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
}