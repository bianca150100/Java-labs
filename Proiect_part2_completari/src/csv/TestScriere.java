package csv;

import csv.*;
import model.*;

import java.io.IOException;

public class TestScriere {


    public static void main(String[] args) throws IOException{
        CsvScriere<Personal> csv = new CsvScriere<>("personal.csv");
        Personal p=new Personal();
        csv.scrieAntet(p);
        csv.scrieCsv(p);


        CsvScriere<UstensileAparatura> csvv = new CsvScriere<>("ustensile.csv");

        UstensileAparatura u1= new UstensileAparatura("Foarfeca", 10, "Alis",false, "liber","spintecare",5,2018);
        UstensileAparatura u2= new UstensileAparatura("Cutit", 7, "Alis",false, "liber","spintecare",2,2016);
        System.out.println(u1);
        csvv.scrieAntet(u1);
        csvv.scrieCsv(u1);
        csvv.scrieCsv(u2);


        CsvScriere<Medicament> csvv2 = new CsvScriere<>("medicament.csv");
        Medicament m1 = new Medicament("Xanax",10, "Farm", 10, 1, 2020, 30, 2, 1);
        Medicament m2 = new Medicament("Parac",20, "Farm", 25, 3, 2020, 30, 2, 1);

        csvv2.scrieAntet(m1);
        csvv2.scrieCsv(m1);
        csvv2.scrieCsv(m2);
    }



}
