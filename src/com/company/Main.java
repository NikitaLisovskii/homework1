package com.company;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Volkswagen(5, "b", "qwerty");
        Driver d1 = new Driver("Жора", 6.5, "b", "qwerty", c1);

        System.out.printf("На парковке стоит автомобиль Jetta\n");
        System.out.printf("Мотор: " + ((Volkswagen) c1).getM().getName() + " Объем: " + ((Volkswagen) c1).getM().getVolume() + "\n");
        System.out.printf("Колеса: " + ((Volkswagen) c1).getW().getName() + " Радиус: " + ((Volkswagen) c1).getW().getRadius() + ", " + ((Volkswagen) c1).getW().getSeason() + "\n");

        System.out.printf("На парковке появляется водитель " + d1.getName() + " со стажем вождения " + d1.getDriveExp() + " лет и с правами категории " + d1.getCategory() + "\n");
        System.out.printf(d1.getName() + " подходит к машине и пытается ее открыть\n");
        if (d1.openAndStart()) {
            System.out.printf(d1.getName() + " открывает машину, садится в нее и заводит двигатель\n");
            c1.start();
            d1.drive();
            d1.passangers();
            d1.refuel();
            System.out.printf("После этого сложного дня " + d1.getName() + " благополучно приезжает домой");
        } else {
            System.out.printf("Ничего не выходит\n");
        }
    }
}
