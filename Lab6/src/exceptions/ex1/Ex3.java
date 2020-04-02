package exceptions.ex1;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args)   {
        int a, b ;
        try {
            create_file();
            Scanner scanner = new Scanner(new File("test.txt"));
            a= scanner.nextInt();
            b= scanner.nextInt();
            double result = a/b;
            System.out.println(result);
            scanner.close();
        } catch (IOException | NoSuchElementException | ArithmeticException e) {
            System.out.println(e);
           // e = new IOException();
        } catch (Exception e)
        {
            System.out.println("Exception");
        }

        finally {
            System.out.println("finally");
            b=0;
        }

    }

    static void create_file() throws IOException {
        File file = new File ("test.txt");
        if ((file.createNewFile()))
            System.out.println("File created");
        else
            System.out.println("File exists");

        throw new IOException("io exc while creating file");
    }
}
