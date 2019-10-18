package homework4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void one() {
        System.out.println("---Задание 1.1---");
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("===============");
    }

    public static void two() {
        System.out.println("---Задание 1.2---");
        String str = "Раму мыла мама";
        char[] chr = str.toCharArray();

        for(char c : chr) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("===============");
    }

    public static void three() {
        System.out.println("---Задание 1.3---");

        String close = "exit";
        String string = "";
        String str = "";
        Scanner scanner = new Scanner(System.in);

        while (!str.equals(close)) {
            str = scanner.nextLine();
            if(!str.equals("exit")) {
                string = string + str + " ";
            }
        }
        scanner.close();
        System.out.println(string);
        System.out.println();
    }

    public static void long2() {
        System.out.println("---Задание 1.4---");

        String str = "012312";
        long a = Long.valueOf(str);
        long b = Long.parseLong(str);

        System.out.println("method 1: " + a);
        System.out.println("method 2: " + b);
        System.out.println();
    }

    public static void iLoveJava() {
        System.out.println("---Задание 2.1---");

        String  string = "Я люблю JAVA";

        System.out.println("h* : " + string.matches("h*"));
        System.out.println("h+ : " + string.matches("h+"));
        System.out.println("h? : " + string.matches("h?"));
        System.out.println();
    }

    public static void iLoveJavaNice(String s) {
        System.out.println("============");
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("Я люблю JAVA");
        System.out.println(s + " : " + m.find());
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        one();
        two();
        three();
        long2();
        iLoveJava();
        iLoveJavaNice("h*");
        iLoveJavaNice("h+");
        iLoveJavaNice("h?");

        Search search = new Search();
        search.search();

        Search2 search2 = new Search2();
        search2.search();
    }
}
