package Streams;
import java.io.*;


public class Ex2 {

    private static final String BASE_ATH = "./src/Streams/";

    public static void main(String[] args) {
        //fluxuri la nivel de fisier
        try (FileReader fr = new FileReader(BASE_ATH + "file1.txt");
             FileWriter fw = new FileWriter(new File(BASE_ATH + "file2.txt"), true)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream(BASE_ATH + "file2.txt");
             FileOutputStream fos = new FileOutputStream(BASE_ATH + "file3.txt")) {
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            fos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
