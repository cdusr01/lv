package com.example.skyrkov235;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class ListItem extends AppCompatActivity {
    private int avatarId;
    private String name;
    private long number;

    private ListItem(int avatarId, String name, long number) {
        this.avatarId = avatarId;
        this.name = name;
        this.number = number;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    private static int[] ids = new int[]{
            R.drawable.bird_1,
            R.drawable.bird_2,
            R.drawable.bird_3
    };

    private static String[] names = new String[]{
            "Petya",
            "Vasya",
            "Petr",
            "Vova"
    };
    public static ListItem getListItem(){
        int id = ids[new Random().nextInt(ids.length)];
        String name = names[new Random().nextInt(names.length)];
        long phone = new Random().nextLong();
        return new ListItem(id, name, phone);
    }
}