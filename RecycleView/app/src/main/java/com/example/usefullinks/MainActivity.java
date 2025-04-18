package com.example.usefullinks;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.usefullinks.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Person> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Person> people=new ArrayList<>();


        people.add(new Person("Ivan", R.drawable.im1));
        people.add(new Person("Petr", R.drawable.im2));
        people.add(new Person("Vladimir", R.drawable.im3));
        people.add(new Person("Artem", R.drawable.im4));

        binding.recycleView.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        binding.recycleView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(people);

        binding.recycleView.setAdapter(adapter);

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.add(new Person("New people", R.drawable.im5));
                adapter.notifyDataSetChanged();
            }
        });

        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (people.size() > 0){
                    people.remove(people.size() - 1);
                    adapter.notifyDataSetChanged();
                }
            }
        });

        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.clear();
                adapter.notifyDataSetChanged();
            }
        });
    }
}