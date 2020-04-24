package model;

public abstract class Dotare {
    private String denumire;
    private int nrProduse;
    private String distribuitor;

    public Dotare(String denumire, int nrProduse, String distribuitor) {
        this.denumire = denumire;
        this.nrProduse = nrProduse;
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

    public int getNrProduse() {
        return nrProduse;
    }

    public void setNrProduse(int nr_produse) {
        this.nrProduse = nr_produse;
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
                        ", nr_produse: " + nrProduse +
                        ", distribuitor: " + distribuitor +  " ";
    }

    abstract public boolean verificaValabilitate();

}
