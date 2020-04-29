package javaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Ex1 {
    private static final String BASE_ATH="./src/javaIO/";
    public static String ex1()
    {   String filePath=BASE_ATH + "file1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {   String c;
            String sCurrentLine;
            int maxLen=0;
            String sirLung=" ";
            while ((sCurrentLine = br.readLine()) != null)
            {

                String[] arr=sCurrentLine.split(" ");
                for (int i=0;i<arr.length;i++) {
                    String aux = arr[i];
                    if (aux.length()>maxLen)
                    {
                        maxLen=aux.length();
                        sirLung=aux;
                    }
                }
            }
            System.out.println("Cel mai lung sir: ");
            System.out.println(sirLung);
            return sirLung;
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
         }
        return " ";
    }

    public static void main(String[] args)
    {
        ex1();
    }
}
