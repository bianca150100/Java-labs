package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvCitire<T extends CsvInterface> {
    protected BufferedReader csvReader;

    public  CsvCitire()
    {}

    public CsvCitire(BufferedReader csvReader) {
        this.csvReader = csvReader;
    }

    public List<T> citireCsv(T object, String path) throws IOException
    {
        System.out.println("A intrat");
        List<T> listElem = new ArrayList<>();
        File csvFile = new File(path);
        if (csvFile.isFile()) {
            System.out.println("si aici");
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(" , ");
                System.out.println("inainte");
                System.out.println(object);
                object.getAraayfromString(data);
                listElem.add(object);
                System.out.println("dupa");
                System.out.println(object);

            }
            csvReader.close();
        }
        return listElem;
    }
}
