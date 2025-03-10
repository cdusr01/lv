package com.example.listview;

import java.util.Random;

public class ListItem{
    private int avatarId;
    private String name;
    private long phone;

    public ListItem(int avatarId, String name, long phone) {
        this.phone = phone;
        this.avatarId = avatarId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    private static int[] ids = new int[]{
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7
    };

    private static String[] names = new String[]{
            "Vasya",
            "Nikita",
            "Petya",
            "Dima",
            "Artem",
            "Angelina",
            "VladiSlave",
            "Ildar",
            "Evgeniy",
            "Ilya"
    };

    public static ListItem getListItem() {
        int id = ids[new Random().nextInt(ids.length)];
        String name = names[new Random().nextInt(names.length)];
        long randomNumber = new Random().nextLong();
        return new ListItem(id, name, randomNumber);
    }

}