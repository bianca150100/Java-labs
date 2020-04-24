package serviciu;

import csvSingleton.*;
import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiciuMemorare {
    static List<Pacient> listaPacienti = new ArrayList<>();
    static List<Programare> listaProgramari = new ArrayList<>();
    static List<Medicament> listaMedicament = new ArrayList<>();
    static List<Reteta> listaReteta = new ArrayList<>();
    static List<Personal> listaPersonal = new ArrayList<>();

    public static void  memoreazaPacient(String path) throws IOException {
        CsvReader r = CsvReader.getInstance();
        List<String> values = new ArrayList<>();
        values = r.readCsv(path);
        for (int i = 0; i < values.size(); i++) {
            String[] strPacient = values.get(i).split(" , ");
            GestiuneMedici gestiune = new GestiuneMedici();
            Medic[] medici = gestiune.getMedici();
            Pacient p = new Pacient();
            p.setNrIdentificare(Integer.parseInt(strPacient[0]));
            p.setNume(strPacient[1]);
            p.setPrenume(strPacient[2]);
            p.setVarsta(Integer.parseInt(strPacient[3]));
            p.setZi_nastere(Integer.parseInt(strPacient[4]));
            p.setLuna_nastere(Integer.parseInt(strPacient[5]));
            p.setAn_nastere(Integer.parseInt(strPacient[6]));
            Programare pp = new Programare(Integer.parseInt(strPacient[8]), Integer.parseInt(strPacient[9]), Integer.parseInt(strPacient[10]), Integer.parseInt(strPacient[11]), p, medici[Integer.parseInt(strPacient[7])]);
            p.setProgramare(pp);
           // System.out.println(p);
            listaPacienti.add(p);
            listaProgramari.add(pp);

        }
    }

    public static void  memoreazaMedicament(String path) throws IOException {
            CsvReader r = CsvReader.getInstance();
            List<String> values= new ArrayList<>();
            values=  r.readCsv(path);
            for(int i=0; i<values.size();i++) {
                String[] strMedicament = values.get(i).split(" , ");
                Medicament m = new Medicament(strMedicament[0],Integer.parseInt(strMedicament[1]),
                        strMedicament[2],Integer.parseInt(strMedicament[3]),Integer.parseInt(strMedicament[4])
                        , Integer.parseInt(strMedicament[5]), Integer.parseInt(strMedicament[6]), Integer.parseInt(strMedicament[7]),Float.parseFloat(strMedicament[8]));

                listaMedicament.add(m);
            }


    }

    public static void memoreazaPersonal(String path) throws IOException
    {
        CsvReader r = CsvReader.getInstance();
        List<String> values= new ArrayList<>();
        values=  r.readCsv(path);
        for(int i=0; i<values.size();i++) {
            String[] strPersonal = values.get(i).split(" , ");
            Personal p = new Personal(strPersonal[0],strPersonal[1],Integer.parseInt(strPersonal[2]));
            listaPersonal.add(p);
        }

    }

    public static void memoreazaReteta(String path) throws IOException
    {
        CsvReader r = CsvReader.getInstance();
        List<String> values= new ArrayList<>();
        values=  r.readCsv(path);
        for(int i=0; i<values.size();i++) {
            String[] str  = values.get(i).split(" , ");
            GestiuneMedici gestiune = new GestiuneMedici();
            Medic[] medici = gestiune.getMedici();
            Pacient p = new Pacient();
            p.setNrIdentificare(Integer.parseInt(str[0]));
            p.setNume(str[1]);
            p.setPrenume(str[2]);
            p.setVarsta(Integer.parseInt(str[3]));
            p.setZi_nastere(Integer.parseInt(str[4]));
            p.setLuna_nastere(Integer.parseInt(str[5]));
            p.setAn_nastere(Integer.parseInt(str[6]));
            Programare pp = new Programare(Integer.parseInt(str[8]), Integer.parseInt(str[9]), Integer.parseInt(str[10]), Integer.parseInt(str[11]), p, medici[Integer.parseInt(str[7])]);
            p.setProgramare(pp);
            Reteta rr = new Reteta(p, Integer.parseInt(str[12]),str[13] ,Integer.parseInt(str[14]), Boolean.parseBoolean(str[15]));
            listaReteta.add(rr);

        }
    }

    public static void memoreaza() throws IOException
    {
        ServiciuMemorare.memoreazaPacient("./src/pacient.csv");
       //System.out.println(testCsvSingleton.listaPacienti.size());

        ServiciuMemorare.memoreazaMedicament("./src/medicamentcit.csv");
     //   System.out.println(testCsvSingleton.listaMedicament.size());

        ServiciuMemorare.memoreazaPersonal("./src/personalcit.csv");
     //   System.out.println(testCsvSingleton.listaPersonal.size());

        ServiciuMemorare.memoreazaReteta("./src/reteta.csv");
      //  System.out.println(testCsvSingleton.listaReteta.size());
    }




    public static void main(String[] args) throws IOException {

        ServiciuMemorare.memoreaza();
    }
}
