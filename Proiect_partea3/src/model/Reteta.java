package model;

public class Reteta {
    private Pacient p;
    private int nrFisa;
    private String diagnostic;
    private int perioadaTratament;
    private boolean necesitaConcediu;

    public Reteta() {
    }

    public Reteta(Pacient p, int nrFisa, String diagnostic, int perioadaTratament, boolean necesitaConcediu) {
        this.p = p;
        this.nrFisa = nrFisa;
        this.diagnostic = diagnostic;
        this.perioadaTratament = perioadaTratament;
        this.necesitaConcediu = necesitaConcediu;
    }

    public Pacient getP() {
        return p;
    }

    public void setP(Pacient p) {
        this.p = p;
    }

    public int getNrFisa() {
        return nrFisa;
    }

    public void setNrFisa(int nrFisa) {
        this.nrFisa = nrFisa;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public int getPerioadaTratament() {
        return perioadaTratament;
    }

    public void setPerioadaTratament(int perioadaTratament) {
        this.perioadaTratament = perioadaTratament;
    }

    public boolean isNecesitaConcediu() {
        return necesitaConcediu;
    }

    public void setNecesitaConcediu(boolean necesitaConcediu) {
        this.necesitaConcediu = necesitaConcediu;
    }

    @Override
    public String toString() {
        return "Reteta \n " +
                "Subsemnatul/a " + p + " \n Nr. Fisa: " + nrFisa + " Diagnostic: " + diagnostic;
    }

}
