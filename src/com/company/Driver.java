package com.company;

public class Driver implements IDriver {
    private String name;
    private double driveExp;
    private String category;
    private String key;
    private Car car = new Volkswagen(5, "b", "qwerty");

    Driver(String name, double driveExp, String category, String key, Car car) {
        this.name = name;
        this.driveExp = driveExp;
        this.category = category;
        this.key = key;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public double getDriveExp() {
        return driveExp;
    }

    public String getCategory() {
        return category;
    }

    public String getKey() {
        return key;
    }

    public boolean openAndStart() {
        if (((Volkswagen) car).getLicense() == category) {

        } else {
            System.out.printf("У водителя неподходящие права\n");
            return false;
        }
        if (((Volkswagen) car).getOpen() == key) {
            return true;
        } else {
            System.out.printf("У водителя неподходящие ключи\n");
            return false;
        }
    }

    @Override
    public void drive() {
        System.out.printf("Водитель начинает движение\n");
    }

    @Override
    public void passangers() {
        System.out.printf("Водитель останавливается на остановке, там стоят 8 пассажиров");
        if(((Volkswagen) car).getSeats() <= 8) {
            System.out.printf(" он забирает их всех\n");
        } else {
            System.out.printf(" он забирает только " + ((Volkswagen) car).getSeats() + "так как больше не хватает мест\n");
        }
    }

    @Override
    public void refuel() {
        System.out.printf("Водитель заехал на запрравку и заправляет полный бак\n");
    }
}
