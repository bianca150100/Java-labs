package exceptions.ex2;

public class Main {
    private static final int AMOUNT=100;
    public static void main (String[] args)   {
        try {
            m1(101);
        } catch (MyCheckedException e) {
            System.out.println("e");
            m2();
        }finally {
            System.out.println("finally");
        }
    }

    static int m1(int x) throws MyCheckedException {
        if ( x < AMOUNT)
        {
            return  x*5;
        }
        else
        {
            throw new MyCheckedException(":(");
        }
    }

    static void m2()
    {
        throw new MyRuntimeException("in m2");
    }
}
