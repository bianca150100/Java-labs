package model;

import csv.CsvInterface;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class UstensileAparatura extends Dotare implements CsvInterface {
    private boolean unicaFolosinta;
    private String utilizare;
    private String intrebuintare;
    private int timpUtilizare;
    private int anAchizitionare;

    public UstensileAparatura() {
        super();
    }

    public UstensileAparatura(String denumire, int nr_produse, String distribuitor, boolean unicaFolosinta, String utilizare, String intrebuintare, int timpUtilizare, int anAchizitionare) {
        super(denumire, nr_produse, distribuitor);
        this.unicaFolosinta = unicaFolosinta;
        this.utilizare = utilizare;
        this.intrebuintare = intrebuintare;
        this.timpUtilizare = timpUtilizare;
        this.anAchizitionare = anAchizitionare;
    }

    public boolean isUnicaFolosinta() {
        return unicaFolosinta;
    }

    public void setUnicaFolosinta(boolean unicaFolosinta) {
        this.unicaFolosinta = unicaFolosinta;
    }

    public String getUtilizare() {
        return utilizare;
    }

    public void setUtilizare(String utilizare) {
        this.utilizare = utilizare;
    }

    public String getIntrebuintare() {
        return intrebuintare;
    }

    public void setIntrebuintare(String intrebuintare) {
        this.intrebuintare = intrebuintare;
    }

    public int getTimpUtilizare() {
        return timpUtilizare;
    }

    public void setTimpUtilizare(int timpUtilizare) {
        this.timpUtilizare = timpUtilizare;
    }

    public int getAnAchizitionare() {
        return anAchizitionare;
    }

    public void setAnAchizitionare(int anAchizitionare) {
        this.anAchizitionare = anAchizitionare;
    }

    @Override
    public boolean  verificaValabilitate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();

        if (this.timpUtilizare + this.anAchizitionare > year)
        {
            return false;}
        return true;
    }

    @Override
    public String toString() {
        return "\nUstensile: " + super.toString() +
                ", utilizare: '" + utilizare +
                ", intrebuintare: '" + intrebuintare  +
                ", timp_maxim_de_utilizare: " + timpUtilizare +
                ", an_achizitionare: " + anAchizitionare ;
    }

    @Override
    public String[] getStringfromArray() {
        return new String[] {super.getDenumire(),super.getDistribuitor(),Boolean.toString(unicaFolosinta), utilizare, intrebuintare, Integer.toString(timpUtilizare),
                Integer.toString(anAchizitionare)
        };
    }

    @Override
    public void getAraayfromString(String[] a) {
        this.unicaFolosinta = Boolean.parseBoolean(a[2]);
        this.timpUtilizare = Integer.parseInt(a[5]);
        this.anAchizitionare=Integer.parseInt(a[6]);
        super.setDenumire(a[0]);
        super.setDistribuitor(a[1]);
        this.utilizare=a[3];
        this.intrebuintare=a[4];
    }

    @Override
    public String[] seteazaColoane() {
        String[] a ={"Denumire", "Distribuitor", "Unica Folosita", "Mod de folosire", "Utilizat la" , "timpUtilizare", "anAchizitie"};

        return a;
    }

    @Override
    public int nrColoane() {
        return 7;
    }
}
