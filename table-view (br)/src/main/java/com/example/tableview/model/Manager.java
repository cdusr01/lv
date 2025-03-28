package com.example.tableview.model;

public class Manager extends Employee{

    public Manager(double s, String name) {
        super(s, name);
    }

    @Override
    public double zarpl(){
        return 13000;
    }
}
