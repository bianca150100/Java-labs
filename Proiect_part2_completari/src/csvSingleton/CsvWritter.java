package csvSingleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWritter {
    private static CsvWritter instance= null;
    //private static String basePath;

    private CsvWritter()
    {

    }

    public static CsvWritter getInstance()
    {
        if (instance==null)
            instance=new CsvWritter();
        return  instance;
    }

    public void writeCsv(List<String> values, String path) throws IOException
    {

        FileWriter csvWriter = new FileWriter(path,true);
        csvWriter.append(String.join(" , ", values));
        csvWriter.append("\n");
        csvWriter.flush();
        //csvWriter.close();

    }
}
