package homework8;

public class TaskTwoTwo extends TaskTwoOne {
    public static void neFish(int a) throws ExceptionTwo{
        System.out.println("----Task 2.2----");
        if(a < 0) {
            throw new ExceptionTwo("Error");
        } else {
            System.out.println("Это уже не рыба");
        }
        System.out.println("--------------");
    }
}
