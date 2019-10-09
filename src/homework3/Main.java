package homework3;

public class Main {

    public static void table() {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void factorial() {
        int n = 1;
        for(int i = 1; i < 5; i++) {
            n *= i;
        }
        System.out.println(n);
    }

    public static void cifr() {
        int n = 565;
        int num;
        int b = 1;
        while ((n > 0)) {
            num = n % 10;
            n /= 10;
            b *= num;
        }
        System.out.println(b);
    }

    public static void mass() {
        int[] m = new int[10];
        int i = 0;

        do{
            m[i] = i + 1;
            System.out.print(" m[" + i + "] = " + m[i]);
            i++;
        } while(i < m.length);

        System.out.println("");

        i = 0;

        while (i < m.length) {
            System.out.print(" m[" + i + "] = " + m[i]);
            i++;
        }

        System.out.println("");

        for(int j = 0; j < m.length; j++) {
            System.out.print(" m[" + j + "] = " + m[j]);
        }

        System.out.println("");

        int k = 0;
        for (int d: m) {
            System.out.print(" m[" + k + "] = " + d);
            k++;
        }

        System.out.println("");
    }

    public static void twoTwo() {
        int[] mas = new int[10];
        for(int i = 0; i < mas.length; i++) {
            mas[i] = i + 5;
        }

        for (int i = 0; i < mas.length; i++) {
            if(i % 2 != 0) {
                System.out.print(" mas[" + i + "] = " + mas[i]);
                System.out.println("");
            }
        }
    }

    public static void twoThree() {
        String[] mas = {"a", "b", "c", "d", "e", null, "o"};

        for (int i = 0; i <mas.length; i++) {
            if(i % 2 != 0) {
                System.out.print("  mas[" + i + "] = " + mas[i]);
            }
            if(mas[i] == null) {
                break;
            }
        }
        System.out.println("");
    }

    public static void Three() {
        Alcohol[] alcohol = new Alcohol[5];
        for (int i = 0; i < alcohol.length; i++) {
            alcohol[i] = new Vodka("Сваяк", 40);
            System.out.println(alcohol[i]);
        }
    }

    public static void main(String[] args) {
        table();
        factorial();
        cifr();
        mass();
        twoTwo();
        twoThree();
        Three();
    }
}
