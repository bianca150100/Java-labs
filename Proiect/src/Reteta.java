public class Reteta {
    private Pacient p;
    private int nr_fisa;
    private String diagnostic;
    private int perioada_tratament;
    private boolean necesita_concediu;

    public Reteta() {
    }

    public Reteta(Pacient p, int nr_fisa, String diagnostic, int perioada_tratament, boolean necesita_concediu) {
        this.p = p;
        this.nr_fisa = nr_fisa;
        this.diagnostic = diagnostic;
        this.perioada_tratament = perioada_tratament;
        this.necesita_concediu = necesita_concediu;
    }

    public Pacient getP() {
        return p;
    }

    public void setP(Pacient p) {
        this.p = p;
    }

    public int getNr_fisa() {
        return nr_fisa;
    }

    public void setNr_fisa(int nr_fisa) {
        this.nr_fisa = nr_fisa;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public int getPerioada_tratament() {
        return perioada_tratament;
    }

    public void setPerioada_tratament(int perioada_tratament) {
        this.perioada_tratament = perioada_tratament;
    }

    public boolean isNecesita_concediu() {
        return necesita_concediu;
    }

    public void setNecesita_concediu(boolean necesita_concediu) {
        this.necesita_concediu = necesita_concediu;
    }

    @Override
    public String toString() {
        return "Reteta \n " +
                "Subsemnatul/a " + p + " \n Nr. Fisa: " + nr_fisa + " Diagnostic: " + diagnostic;
    }

}
