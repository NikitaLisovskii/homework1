package homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionTwo, ExceptionOne{
        TaskOne t1 = new TaskOne();

        t1.oneOne();
        try {
            t1.oneTwo();
        } catch (Exception e) {

        }
        t1.oneThree();

        TaskTwoOne t2 = new TaskTwoOne();

        try {
            t2.fish(3);
        } catch (ExceptionOne e) {
            t2.fish(0);
        }

        TaskTwoTwo t3 = new TaskTwoTwo();

        try {
            t3.neFish(0);
        } catch (ExceptionTwo e) {
            t3.neFish(4);
        }

        Three_Four();
    }


    public static void Three_Four() {
        System.out.println("----Task 3----");
        System.out.println("Введите 7 чисел ");

        int [] arr = new int[7];
        int err = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        if (err <= 2){
            for (int i = 0; i < arr.length; i++) {
                try {
                    arr[i] = Integer.parseInt(new Scanner(System.in).nextLine());
                } catch (NumberFormatException e) {
                    if(err < 3) {
                        System.out.println("Некорректный ввод");
                        err++;
                        i--;
                    }
                    else {
                        System.out.println("Больше 3 ошибок");
                        break;
                    }
                }
            }
        } else
            System.out.println("Больше 3");

        for (int i=0; i < arr.length; i++){
            arrayList.add(i, arr[i]);
        }
        Collections.sort(arrayList);
        for (int i: arrayList) {
            System.out.println(i);
        }
    }
    }

