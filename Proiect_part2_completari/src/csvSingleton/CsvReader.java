package csvSingleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    //private static String path;
    private static CsvReader instance= null;

    private CsvReader()
    {}

    public static CsvReader getInstance()
    {
        if (instance==null)
            instance=new CsvReader();
        return  instance;
    }

    public List<String> readCsv(String path) throws IOException
    {


        List<String> listElem = new ArrayList<>();
        File csvFile = new File(path);
        if (csvFile.isFile()) {

            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            String row;
            while ((row = csvReader.readLine()) != null) {

                listElem.add(row);

            }
            csvReader.close();
        }
        return listElem;
    }

}
