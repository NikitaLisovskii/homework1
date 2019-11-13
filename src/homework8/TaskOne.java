package homework8;

public class TaskOne {

    static int a = 7;
    static int c = 0;

    public static void oneOne() {
        System.out.println("------Task 1.1------");
        try {
            int b = a/c;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        }
        System.out.println("---------------");
    }

    public static void oneTwo() {
        System.out.println("------Task 1.2------");
        try {
           int b = a/c;
        } finally {
            System.out.println("Ошибка без catch");
        }
        System.out.println("---------------");
    }

    public static void oneThree() {
        System.out.println("------Task 1.3------");
        try {
            int b = a/c;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль");
        } finally {
            System.out.println("А я выполняюсь в любом случае");
        }
        System.out.println("------------------");
    }
}
