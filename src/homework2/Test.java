package homework2;

public class Test {

    private Integer k;
    private int z;
    private int i;

    public void method() {
        i = k + z;
    }

    public static void main(String[] args) {
        Test t = new Test();         //в классе Test нет конструктора, поэтому мы не можем проинициализировать переменные в этом классе
        t.method();                 //их значение равно null, из-за этого mhetod бессмыслен и не выполняется
        System.out.println(t.i);
    }
}