package com.example.usefullinks;

public class Person {
    private String name;
    private  int avatarId;

    public String getName(){
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


    public Person(String name,int avatarId) {
        this.name = name;
        this.avatarId = avatarId;
    }


}
