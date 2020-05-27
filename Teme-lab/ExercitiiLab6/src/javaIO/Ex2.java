package javaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static javaIO.Ex1.ex1;


public class Ex2 {
    private static final String BASE_ATH="./src/javaIO/";
    public static void ex2()
    {
        String filePath=BASE_ATH + "file1.txt";
        try {
            String a=ex1();
            a="\n"+a;
            FileWriter fw = new FileWriter(new File(BASE_ATH + "file1.txt"), true);

            BufferedWriter br = new BufferedWriter(fw);
            br.write(a);

            br.close();
            fw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        ex2();
    }
}
