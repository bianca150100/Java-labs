package exceptions.ex1;

public class Ex2 {
    public static void main (String[] args) {
        try {
            int x = m1();
        } catch (ArithmeticException e) {
            System.out.println("catch");

        } finally {
            System.out.println("finally");
        }
    }

    static int m1()
    {
        int i =5/0;
        System.out.println(i);
        return i;
    }
}
