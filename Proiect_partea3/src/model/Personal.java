package model;

import csv.CsvInterface;

import javax.swing.*;

public class Personal implements CsvInterface {
    private String nume;
    private String prenume;
    private int anAngajare;

    public Personal() {
        this.nume="Andrei";
        this.prenume="Antonip";
        this.anAngajare=2009;
    }

    public Personal(String nume, String prenume, int an_angajare) {
        this.nume = nume;
        this.prenume = prenume;
        anAngajare = an_angajare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAnangajare() {
        return anAngajare;
    }

    public void setAnangajare(int an_angajare) {
        anAngajare = an_angajare;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", An_angajare=" + anAngajare +
                '}';
    }

    @Override
    public String[] getStringfromArray() {
        return new String[] {nume, prenume, Integer.toString(anAngajare)};
    }

    @Override
    public void getAraayfromString(String[] a) {
        this.nume=a[0];
        this.prenume=a[1];
        System.out.println("a[2");
        System.out.println(a[2]);
        this.anAngajare = Integer.parseInt(a[2]);
        //this.anAngajare=2000;
   }

    @Override
    public String[] seteazaColoane() {
        String[] a ={"nume", "prenume" , "anAngajare"};
        System.out.println("intra in personal");
        System.out.println(a[0]);
        return a;
    }

    @Override
    public int nrColoane() {
        return 3;
    }
}
