package model;

import csv.CsvInterface;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Medicament extends Dotare implements CsvInterface {
    private int ziExp;
    private int lunaExp;
    private int anExp;
    private int nrProduseCutie;
    private int dozaRecomandataZi;
    private float dozaj;

    public Medicament() {
    }

    public Medicament(String denumire, int nrProduse, String distribuitor, int ziExp, int lunaExp, int anExp, int nrProduseCutie, int doza_recomandata_zi, float dozaj) {
        super(denumire, nrProduse, distribuitor);
        this.ziExp = ziExp;
        this.lunaExp = lunaExp;
        this.anExp = anExp;
        this.nrProduseCutie = nrProduseCutie;
        this.dozaRecomandataZi = doza_recomandata_zi;
        this.dozaj = dozaj;
    }



    public int getZiExp() {
        return ziExp;
    }

    public void setZiExp(int zi_exp) {
        this.ziExp = zi_exp;
    }

    public int getLunaExp() {
        return lunaExp;
    }

    public void setLunaExp(int luna_exp) {
        this.lunaExp = luna_exp;
    }

    public int getAnExp() {
        return anExp;
    }

    public void setAnExp(int an_exp) {
        this.anExp = an_exp;
    }

    public int getNrProduseCutie() {
        return nrProduseCutie ;
    }

    public void setNrProduseCutie(int nrProduseCutie) {
        this.nrProduseCutie = nrProduseCutie;
    }

    public int getDozaRecomandataZi() {
        return dozaRecomandataZi;
    }

    public void setDozaRecomandataZi(int dozaRecomandataZi) {
        this.dozaRecomandataZi = dozaRecomandataZi;
    }

    public float getDozaj() {
        return dozaj;
    }

    public void setDozaj(float dozaj) {
        this.dozaj = dozaj;
    }

    @Override
    public boolean  verificaValabilitate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        int day   = localDate.getDayOfMonth();
        System.out.println("day: " + day + " " +month + " " + year);
        if (this.anExp > year)
            return false;
        else
        {
            if(this.anExp == year)
            {
                if( this.lunaExp >month)
                    return false;
                else
                if(this.lunaExp ==month)
                {
                    if( this.ziExp > day)
                        return false;
                }
            }
        }
        return  true;
    }

    @Override
    public String toString() {
        return  "\n" + "Medicament: " + super.toString() + " " +
                ", data expirarii: " + ziExp +
                "-" + lunaExp +
                "-" + anExp +
                ", nr_pastile/cutie: " + nrProduseCutie +
                ", doza_recomandata/zi: " + dozaRecomandataZi +
                ", concentratie: " + dozaj ;
    }

    @Override
    public String[] getStringfromArray() {
        return new String[] {super.getDenumire(),super.getDistribuitor(),Integer.toString(ziExp),Integer.toString(anExp),
                Integer.toString(lunaExp), Integer.toString(nrProduseCutie),Integer.toString(dozaRecomandataZi),
                Float.toString(dozaj)
        };
    }

    @Override
    public void getAraayfromString(String[] a) {
        super.setDenumire(a[0]);
        super.setDistribuitor(a[1]);
        this.ziExp = Integer.parseInt(a[2]);
        this.lunaExp = Integer.parseInt(a[3]);
        this.anExp=Integer.parseInt(a[4]);
        this.nrProduseCutie=Integer.parseInt(a[5]);
        this.dozaRecomandataZi=Integer.parseInt(a[6]);
        this.dozaj=Float.parseFloat(a[7]);
    }

    @Override
    public String[] seteazaColoane() {
        String[] a ={"Denumire", "Distribuitor", "ZiExpirare", "LunaExpirare", "AnExpirare" , "NrProduseCutie", "Dozarecomandata/zi", "dozaj"};

        return a;
    }

    @Override
    public int nrColoane() {
        return 7;
    }
}
