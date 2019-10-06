package homework2;

public class Main {
    public static void Sdvig() {
        int a = 16;
        int b = 2;
        int c, d;

        d = a >> b;
        c = a << b;

        System.out.println(d);
        System.out.println(c);
    }

    public void DoubleSdvig() {
        double d = 6.82;
        double k = 2.1;
        double e;
        //e = d >> k;  С переменными типа double нельзя делать операции логического сдвига
    }

    public static void DSdvig() {
        int s, k;
        int a = -16;
        int b = 2;

        s = a >> b;
        k = a << b;

        System.out.println(s);
        System.out.println(k);
    }

    public static void If() {
        boolean a = false;
        String f;
        int c = 15;
        int b = 87;

        if(a) {
            f = "True";
        } else {
            f = "False";
        }

        String s = c < b ? "True" : "False";

        System.out.println(f);
        System.out.println(s);
    }

    public static void Pr() {
        int f = 2;
        int r = 8;

        int e = 5 + 2/8; // результат 5, так как 2/8 это интовые цифры и при делении будет 0
        int y = (5 + 2)/8; //результат 0, так как сначала выражение в скобках и получим 7/8, что для инта будет 0
        int i = (5 + f++)/8;  // результат 0, так как ++ выполняется в конце
        int o = (5 + f++)/ --r; // результат 1, так как -- уменьшает 8 перед делением и будет 7/7
        int g = (5 * 2 >> f++)/--r; //результат 0, так как будет (10>>2++)/7= 2/7, что для инта 0
        int t = (5 + 7 > 20 ? 68 : 22 * 2 >> f++)/ --r; //в тернарном операторе мы видим, что будет 22>>2/7
        //int k = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> f++)/ --r; компилятор выдает ошибку, код не компилится
        boolean w = 6 - 2 > 3 && 12 * 12 <= 119; //результат false, так как true&&false = false, логический оператор && давет true, толька когда два выражения true
        boolean q = true && false; //та же самая ситуация, что и в примере выше

        System.out.println(e);
        System.out.println(y);
        System.out.println(i);
        System.out.println(o);
        System.out.println(g);
        System.out.println(t);
        System.out.println(w);
        System.out.println(q);
    }

    public static void main(String[] args) {
            Sdvig();
            DSdvig();
            If();
            Pr();
        }
    }
