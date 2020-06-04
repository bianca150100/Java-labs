package model;

import csv.CsvInterface;

public class Pacient implements CsvInterface {
    private int nrIdentificare;
    private String nume;
    private String prenume;
    protected int varsta;
    protected int anNastere;
    protected int lunaNastere;
    protected int ziNastere;
    private Programare programare;

    public Pacient() {
        this.nrIdentificare=0;
        this.nume="Andrei";
        prenume="Ion";
        varsta=13;
        anNastere=0;
        lunaNastere=0;
        ziNastere=0;


    }

    public Pacient(int nrIdentificare, String nume, String prenume, int varsta, int anNastere, int lunaNastere, int ziNastere, Programare programare) {
        nrIdentificare = nrIdentificare;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.anNastere = anNastere;
        this.lunaNastere = lunaNastere;
        this.ziNastere = ziNastere;
        this.programare =programare;
    }

    public String get_nume()
    {
        return this.nume;
    }

    public String get_prenume()
    {
        return this.prenume;
    }



    public int getNrIdentificare() {
        return nrIdentificare;
    }

    public void setNrIdentificare(int nrIdentificare) {
        nrIdentificare = nrIdentificare;
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

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getAn_nastere() {
        return anNastere;
    }

    public void setAn_nastere(int an_nastere) {
        this.anNastere = an_nastere;
    }

    public int getLuna_nastere() {
        return lunaNastere;
    }

    public void setLuna_nastere(int luna_nastere) {
        this.lunaNastere = luna_nastere;
    }

    public int getZi_nastere() {
        return ziNastere;
    }

    public void setZi_nastere(int zi_nastere) {
        this.ziNastere = zi_nastere;
    }

    public Programare getProgramare() {
        return programare;
    }

    public void setProgramare(Programare programare) {
        this.programare = programare;
    }

    @Override
    public String toString() {
        return "Pacient: " + nume + " " + prenume + " , varsta: " + varsta ;
    }

    @Override
    public String[] getStringfromArray() {
        return new String[] {Integer.toString(nrIdentificare), nume, prenume,Integer.toString(varsta),
                Integer.toString(anNastere), Integer.toString(ziNastere),Integer.toString(lunaNastere),
                Integer.toString(programare.getAnProg()),Integer.toString(programare.getLunaProg()),
                Integer.toString(programare.getZiProg()), Integer.toString(programare.getOraProg())};
    }

    @Override
    public void getAraayfromString(String[] a) {
        this.nrIdentificare = Integer.parseInt(a[0]);
        this.varsta = Integer.parseInt(a[3]);
        this.anNastere = Integer.parseInt(a[4]);
        this.ziNastere = Integer.parseInt(a[5]);
        this.lunaNastere=Integer.parseInt(a[6]);
        this.programare.setAnProg(Integer.parseInt(a[7]));
        this.programare.setLunaProg(Integer.parseInt(a[8]));
        this.programare.setZiProg(Integer.parseInt(a[9]));
        this.programare.setOraProg(Integer.parseInt(a[10]));
    }

    @Override
    public String[] seteazaColoane() {
        String[] a ={"NrIdentificare", "Nume" , "Prenume", "Varsta", "AnNastere" , "ZiNastere", "LunaNastere",
        "AnProgramare", "LunaProgrmare", "ZiProgramare", "OraProgramare"};
        return a;
    }

    @Override
    public int nrColoane() {
        return 11;
    }
}
