package com.company;

public class Volkswagen extends Car{

    private int seats;
    private String license;
    private String open;
    private Motor m = new Motor(1.6, 60, "V8");
    private Wheels w = new Wheels("Mak", 18, "летние");

    Volkswagen(int seats, String license, String open) {
        this.seats = seats;
        this.license = license;
        this.open = open;
    }

    public int getSeats() {
        return seats;
    }

    public String getLicense() {
        return license;
    }

    public String getOpen() {
        return open;
    }

    public Motor getM() {
        return m;
    }

    public Wheels getW() {
        return w;
    }
}
