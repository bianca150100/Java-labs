public abstract class Dotare {
    private String denumire;
    private int nr_produse;
    private String distribuitor;

    public Dotare(String denumire, int nr_produse, String distribuitor) {
        this.denumire = denumire;
        this.nr_produse = nr_produse;
        this.distribuitor = distribuitor;
    }

    public Dotare() {
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_produse() {
        return nr_produse;
    }

    public void setNr_produse(int nr_produse) {
        this.nr_produse = nr_produse;
    }

    public String getDistribuitor() {
        return distribuitor;
    }

    public void setDistribuitor(String distribuitor) {
        this.distribuitor = distribuitor;
    }

    @Override
    public String toString() {
        return
                "Denumire: " + denumire + ' ' +
                ", nr_produse: " + nr_produse +
                ", distribuitor: " + distribuitor +  " ";
    }

    abstract boolean verifica_valabilitate();

}
