package serviciu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ServiciuAudit{
    private FileWriter csvWriter;
    private static ServiciuAudit instance;

    private ServiciuAudit()
    {}

    public static ServiciuAudit getInstance() {
        if(instance== null) {
            instance = new ServiciuAudit();
        }

        return instance;
    }

    public void deschideFis(String path) throws IOException {
        this.csvWriter = new FileWriter(path);

    }

    public void adaugaServiciu(String tipServiciu)
    {
        Date timestamp = new Date();
        String linie = tipServiciu + " , " + timestamp;
        try
        {

            csvWriter.append(linie);
            csvWriter.append("\n");
            csvWriter.flush();
        }
        catch (IOException e)
        {
            System.out.println("Imposibil de scris in fisierul audit");
            e.printStackTrace();
        }
    }

}
