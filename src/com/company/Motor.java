package com.company;

public class Motor {
    private double volume;
    private int fuel;
    private String name;

    public Motor(double volume, int fuel, String name) {
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public int getFuel() {
        return fuel;
    }

    public String getName() {
        return name;
    }
}
