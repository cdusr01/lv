package com.example.tableview.model;

public class Employee {
    private double s;
    private String name;

    public Employee(double s, String name) {
        this.s = s;
        this.name = name;
    }

    public double zarpl(){
        return 0;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
