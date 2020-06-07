package javaIO;

import java.io.*;

public class Ex4 {

    private static final String BASE_ATH = "./src/javaIO/";
    public static void criptare(int offset) throws IOException {
        String filePath=BASE_ATH + "necriptat.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        FileWriter fw = new FileWriter(new File(BASE_ATH + "criptat.txt"), true);
        BufferedWriter b = new BufferedWriter(fw);
        int c = 0;
        while((c = br.read()) != -1)         //Read char by Char
        {
            c=c+offset;
            char character = (char) c;          //converting integer to char
            b.write(c);
            System.out.println(character);        //Display the Character
        }
        b.close();
        fw.close();
    }

    public static void decriptare(int offset) throws IOException
    {
        String filePath=BASE_ATH + "criptat.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        FileWriter fw = new FileWriter(new File(BASE_ATH + "decriptat.txt"), true);
        BufferedWriter b = new BufferedWriter(fw);
        int c = 0;
        while((c = br.read()) != -1)         //Read char by Char
        {
            c=c-offset;
            char character = (char) c;          //converting integer to char
            b.write(c);
            System.out.println(character);        //Display the Character
        }
        b.close();
        fw.close();
    }


    public static void main(String[] args) throws IOException {
        criptare(5);
        decriptare(5);
    }
}
