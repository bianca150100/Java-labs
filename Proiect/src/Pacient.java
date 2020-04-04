import java.util.Arrays;

public class Pacient {
    private int NrIdentificare;
    private String nume;
    private String prenume;
    protected int varsta;
    protected int an_nastere;
    protected int luna_nastere;
    protected int zi_nastere;
    private Programare programare;

    public Pacient() {
        this.NrIdentificare=0;

    }

    public Pacient(int nrIdentificare, String nume, String prenume, int varsta, int an_nastere, int luna_nastere, int zi_nastere, Programare programare) {
        NrIdentificare = nrIdentificare;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.an_nastere = an_nastere;
        this.luna_nastere = luna_nastere;
        this.zi_nastere = zi_nastere;
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
        return NrIdentificare;
    }

    public void setNrIdentificare(int nrIdentificare) {
        NrIdentificare = nrIdentificare;
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
        return an_nastere;
    }

    public void setAn_nastere(int an_nastere) {
        this.an_nastere = an_nastere;
    }

    public int getLuna_nastere() {
        return luna_nastere;
    }

    public void setLuna_nastere(int luna_nastere) {
        this.luna_nastere = luna_nastere;
    }

    public int getZi_nastere() {
        return zi_nastere;
    }

    public void setZi_nastere(int zi_nastere) {
        this.zi_nastere = zi_nastere;
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
}
