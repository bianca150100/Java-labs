package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    private static final String BASE_ATH = "./src/javaIO/";

    public static void ex3() {
        String filePath = BASE_ATH + "file1.txt";
        List<String> linii = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String c;
            String sCurrentLine;
            int maxLen = 0;
            String sirLung = " ";
            while ((sCurrentLine = br.readLine()) != null) {
                linii.add(sCurrentLine);
            }
            System.out.println(linii.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        ex3();
    }
}
