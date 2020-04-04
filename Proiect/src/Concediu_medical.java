public class Concediu_medical {
    private  Pacient p;
    private int nr_inreg;
    private int zi_acordare;
    private int luna_acordare;
    private int zi_incheiere;
    private int luna_incheiere;
    private int cod_diagnostic;

    public Concediu_medical() {
    }

    public Concediu_medical(Pacient p, int nr_inreg, int zi_acordare, int luna_acordare, int zi_incheiere, int luna_incheiere, int cod_diagnostic) {
        this.p = p;
        this.nr_inreg = nr_inreg;
        this.zi_acordare = zi_acordare;
        this.luna_acordare = luna_acordare;
        this.zi_incheiere = zi_incheiere;
        this.luna_incheiere = luna_incheiere;
        this.cod_diagnostic = cod_diagnostic;
    }

    public Pacient getP() {
        return p;
    }

    public void setP(Pacient p) {
        this.p = p;
    }

    public int getNr_inreg() {
        return nr_inreg;
    }

    public void setNr_inreg(int nr_inreg) {
        this.nr_inreg = nr_inreg;
    }

    public int getZi_acordare() {
        return zi_acordare;
    }

    public void setZi_acordare(int zi_acordare) {
        this.zi_acordare = zi_acordare;
    }

    public int getLuna_acordare() {
        return luna_acordare;
    }

    public void setLuna_acordare(int luna_acordare) {
        this.luna_acordare = luna_acordare;
    }

    public int getZi_incheiere() {
        return zi_incheiere;
    }

    public void setZi_incheiere(int zi_incheiere) {
        this.zi_incheiere = zi_incheiere;
    }

    public int getLuna_incheiere() {
        return luna_incheiere;
    }

    public void setLuna_incheiere(int luna_incheiere) {
        this.luna_incheiere = luna_incheiere;
    }

    public int getCod_diagnostic() {
        return cod_diagnostic;
    }

    public void setCod_diagnostic(int cod_diagnostic) {
        this.cod_diagnostic = cod_diagnostic;
    }

    @Override
    public String toString() {
        return "Concediu_medical: " +
                "p=" + p +
                ", nr_inreg=" + nr_inreg +
                ", zi_acordare=" + zi_acordare +
                ", luna_acordare=" + luna_acordare +
                ", zi_incheiere=" + zi_incheiere +
                ", luna_incheiere=" + luna_incheiere +
                ", cod_diagnostic=" + cod_diagnostic +
                '}';
    }
}
