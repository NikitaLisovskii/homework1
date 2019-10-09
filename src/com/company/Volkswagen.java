package com.company;

public class Volkswagen extends Car{

    private int seats;
    private String license;
    private String open;
    private Motor m = new Motor(1.6, 60, "V8");
    private Wheels w = new Wheels("Mak", 18, "летние");

    public Volkswagen(int seats, String license, String open) {
        this.seats = seats;
        this.license = license;
        this.open = open;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setM(Motor m) {
        this.m = m;
    }

    public void setW(Wheels w) {
        this.w = w;
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
