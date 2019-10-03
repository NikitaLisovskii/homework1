package com.company;

public class Wheels {
    private String name;
    private int radius;
    private String season;

    public Wheels(String name, int radius, String season) {
        this.name = name;
        this.radius = radius;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public String getSeason() {
        return season;
    }
}
