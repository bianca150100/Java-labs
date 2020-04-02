package exceptions.ex3;

import java.util.Arrays;

public class Ex3 {
    public static void main (String[] args)   {
        try (R2 r1= new R2("r1");
        R2 r2 = new R2("r2"))
        {
            throw new Exception("Excp in try");
            //System.out.println("In try block");
        }catch (Exception e)
        {
            System.out.println(e);
            //suppressed exc
            Throwable[] suppExp= e.getSuppressed();
            System.out.println(Arrays.toString(suppExp));
        }finally {
            System.out.println("finally");
        }
    }
}
