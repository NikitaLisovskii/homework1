package homework8;

public class TaskTwoOne {
    public static void fish(int a) throws ExceptionOne {
        System.out.println("----Task 2.1----");
        if(a > 0) {
            throw new ExceptionOne("Error");
        } else {
            System.out.println("У рыбы " + a + " ног");
        }
        System.out.println("--------------");
    }

}
