package homework5;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void compareDate() {
        System.out.println("---Задание 1.1---");

        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println("Сравнение через == : " + (date1 == date2));
        System.out.println("Сравнение через equals : " + (date1.equals(date2)));
        System.out.println();
    }

    public static void addDate() {
        System.out.println("---Задание 1.2---");

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Начальная дата: " + date);

        calendar.setTime(date);
        calendar.add(Calendar.DATE, 5);
        calendar.add(Calendar.MONTH, 1);
        date = calendar.getTime();

        System.out.println("Дата после прибавления: " + date);
        System.out.println();
    }

    public static void addYear() {
        System.out.println("---Задание 1.3---");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 01, 29);
        Date date = calendar.getTime();
        System.out.println("Первоначальная дата : " + date);

        calendar.add(Calendar.YEAR, 1);
        date = calendar.getTime();
        System.out.println("Дата после добавления одного года: " + date);
        System.out.println();
    }

    public static void nameCountry(String countryName) {
        System.out.println("---Задание 2.5---");
        Country country = Country.valueOf(countryName);
        System.out.println("Название страны: " + country);
        System.out.println("Численность населения: " + country.getPopulation());
        System.out.println("Площадь страны: " + country.getArea());
        System.out.println();
    }

    public static void compareCountry(Country countryName) {
        System.out.println("---Задание 2.6---");

        String nameCountry = "USA";
        System.out.println("Сравнение: " + (countryName == Country.valueOf(nameCountry)));
        System.out.println();

    }

    public static void noElement(String country){
        System.out.println(Country.valueOf(country)); // Выдает ошибку компиляции
    }

    public static void main(String[] args) {
        compareDate();
        addDate();
        addYear();
        String name = "Canada";
        nameCountry(name);
        compareCountry(Country.USA);
        //noElement("VKL"); Выдает ошибку компиляции
    }
}
