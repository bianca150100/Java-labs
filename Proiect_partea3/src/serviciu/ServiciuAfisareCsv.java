package serviciu;
import csvSingleton.CsvWritter;
import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ServiciuAfisareCsv {
    public static void main (String[] args) throws IOException
    {
        CsvWritter w = CsvWritter.getInstance();
        ServiciuMemorare.memoreaza();
       // System.out.println(ServiciuMemorare.listaMedicament.size());
        for (Medicament m : ServiciuMemorare.listaMedicament )
        {

            String[] str = m.getStringfromArray();
            List<String> myList = new ArrayList<String>(Arrays.asList(str));
            w.writeCsv(myList,"medicamentAfis.csv");
        }


       // System.out.println(ServiciuMemorare.listaPersonal.size());
        for (Personal p : ServiciuMemorare.listaPersonal )
        {

            String[] str = p.getStringfromArray();
            List<String> myList = new ArrayList<String>(Arrays.asList(str));
            w.writeCsv(myList,"personalAfis.csv");
        }

        for (Pacient pp : ServiciuMemorare.listaPacienti)
        {
            String[] str = pp.getStringfromArray();
            List<String> myList = new ArrayList<String>(Arrays.asList(str));
            w.writeCsv(myList,"pacientAfis.csv");
        }

        for (Programare prog : ServiciuMemorare.listaProgramari)
        {
            String[] str = prog.getStringfromArray();
            List<String> myList = new ArrayList<String>(Arrays.asList(str));
            w.writeCsv(myList,"programariAfis.csv");
        }



    }

}
