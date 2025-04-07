package com.example.usefullinks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {

    private List<Person> list;

    public MyAdapter(List<Person> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cardview, parent, false);
        PersonViewHolder holder = new PersonViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.text.setText(list.get(position).getName());
        holder.image.setImageResource(list.get(position).getAvatarId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        public Button button;
        public ImageView image;
        public TextView text;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.btnPress);
            image = itemView.findViewById(R.id.imgView);
            text = itemView.findViewById(R.id.tv);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Hi student" + text.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

}
