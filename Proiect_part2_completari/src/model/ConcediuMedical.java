package model;

public class ConcediuMedical {
    private  Pacient p;
    private int nrInreg;
    private int ziAcordare;
    private int lunaAcordare;
    private int ziIncheiere;
    private int lunaIncheiere;
    private int codDiagnostic;

    public ConcediuMedical() {
    }

    public ConcediuMedical(Pacient p, int nr_inreg, int zi_acordare, int luna_acordare, int zi_incheiere, int luna_incheiere, int cod_diagnostic) {
        this.p = p;
        this.nrInreg = nr_inreg;
        this.ziAcordare = zi_acordare;
        this.lunaAcordare = luna_acordare;
        this.ziIncheiere = zi_incheiere;
        this.lunaIncheiere = luna_incheiere;
        this.codDiagnostic = cod_diagnostic;
    }

    public Pacient getP() {
        return p;
    }

    public void setP(Pacient p) {
        this.p = p;
    }

    public int getNrInreg() {
        return nrInreg;
    }

    public void setNrInreg(int nrInreg) {
        this.nrInreg = nrInreg;
    }

    public int getZiAcordare() {
        return ziAcordare;
    }

    public void setZiAcordare(int ziAcordare) {
        this.ziAcordare = ziAcordare;
    }

    public int getLunaAcordare() {
        return lunaAcordare;
    }

    public void setLunaAcordare(int lunaAcordare) {
        this.lunaAcordare = lunaAcordare;
    }

    public int getZiIncheiere() {
        return ziIncheiere;
    }

    public void setZiIncheiere(int ziIncheiere) {
        this.ziIncheiere = ziIncheiere;
    }

    public int getLunaIncheiere() {
        return lunaIncheiere;
    }

    public void setLunaIncheiere(int lunaIncheiere) {
        this.lunaIncheiere = lunaIncheiere;
    }

    public int getCodDiagnostic() {
        return codDiagnostic;
    }

    public void setCodDiagnostic(int codDiagnostic) {
        this.codDiagnostic = codDiagnostic;
    }

    @Override
    public String toString() {
        return "Concediu_medical: " +
                "p=" + p +
                ", nr_inreg=" + nrInreg +
                ", zi_acordare=" + ziAcordare +
                ", luna_acordare=" + lunaAcordare +
                ", zi_incheiere=" + ziIncheiere +
                ", luna_incheiere=" + lunaIncheiere +
                ", cod_diagnostic=" + codDiagnostic +
                '}';
    }
}
