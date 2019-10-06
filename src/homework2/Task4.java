package homework2;

public class Task4 {
   public static void main(String[] args) {
       Ram  ram = new Ram(16);
       Hdd hdd = new Hdd(256);
       Computer computer = new Computer(ram,hdd);
       System.out.println(computer instanceof Computer);
       System.out.println(computer instanceof IComputer);
   }

}
