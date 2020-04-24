package csv;


import java.io.FileWriter;
import java.io.IOException;

public class CsvScriere<T extends CsvInterface> {
    protected FileWriter csvWriter;

    public CsvScriere(String path) throws IOException{
        this.csvWriter = new FileWriter(path);
    }

    public void scrieAntet(T object) throws IOException {
        if (object != null) {
            String[] coloane = object.seteazaColoane();
            int nrColoane = object.nrColoane();
            for (int i = 0; i < nrColoane; i++) {

                csvWriter.append(coloane[i]);
                if (i != nrColoane - 1)
                    csvWriter.append(" , ");
            }
            csvWriter.append("\n");
        }
    }

    public void scrieCsv(T object) throws IOException{
        if (object != null)
        {
            int nrColoane= object.nrColoane();
             String[] str= object.getStringfromArray();
            for (int i=0;i<nrColoane;i++)
            {

                csvWriter.append(str[i]);
                if (i!=nrColoane-1)
                    csvWriter.append(" , ");
            }
            csvWriter.append("\n");

            csvWriter.flush();

        }
    }
}
