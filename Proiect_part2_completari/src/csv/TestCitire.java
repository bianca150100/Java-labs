package csv;

import csv.*;
import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCitire {
    public static void main(String[] args) throws IOException{
        CsvCitire<Personal> csvv = new CsvCitire<>();
        Personal p=new Personal();
        List<Personal> listElem = csvv.citireCsv(p,"./src/personalcit.csv");
        System.out.println(listElem.size());

        CsvCitire<Medicament> csv = new CsvCitire<>();
        Medicament m=new Medicament();
        List<Medicament> listElem2 = csv.citireCsv(m,"./src/medicamentcit.csv");
        System.out.println(listElem2.size());

        CsvCitire<UstensileAparatura> csv3 = new CsvCitire<>();
        UstensileAparatura u=new UstensileAparatura();
        List<UstensileAparatura> listElem3 = csv3.citireCsv(u,"./src/ustensilacit.csv");
        System.out.println(listElem3.size());
    }
}
