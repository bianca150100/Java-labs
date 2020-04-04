import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Medicament extends Dotare{
    private int zi_exp;
    private int luna_exp;
    private int an_exp;
    private int nr_produse_cutie;
    private int doza_recomandata_zi;
    private float dozaj;

    public Medicament() {
    }

    public Medicament(String denumire, int nr_produse, String distribuitor, int zi_exp, int luna_exp, int an_exp, int nr_produse_cutie, int doza_recomandata_zi, float dozaj) {
        super(denumire, nr_produse, distribuitor);
        this.zi_exp = zi_exp;
        this.luna_exp = luna_exp;
        this.an_exp = an_exp;
        this.nr_produse_cutie = nr_produse_cutie;
        this.doza_recomandata_zi = doza_recomandata_zi;
        this.dozaj = dozaj;
    }



    public int getZi_exp() {
        return zi_exp;
    }

    public void setZi_exp(int zi_exp) {
        this.zi_exp = zi_exp;
    }

    public int getLuna_exp() {
        return luna_exp;
    }

    public void setLuna_exp(int luna_exp) {
        this.luna_exp = luna_exp;
    }

    public int getAn_exp() {
        return an_exp;
    }

    public void setAn_exp(int an_exp) {
        this.an_exp = an_exp;
    }

    public int getNr_produse_cutie() {
        return nr_produse_cutie;
    }

    public void setNr_produse_cutie(int nr_produse_cutie) {
        this.nr_produse_cutie = nr_produse_cutie;
    }

    public int getDoza_recomandata_zi() {
        return doza_recomandata_zi;
    }

    public void setDoza_recomandata_zi(int doza_recomandata_zi) {
        this.doza_recomandata_zi = doza_recomandata_zi;
    }

    public float getDozaj() {
        return dozaj;
    }

    public void setDozaj(float dozaj) {
        this.dozaj = dozaj;
    }

    @Override
    boolean verifica_valabilitate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        int day   = localDate.getDayOfMonth();
        System.out.println("day: " + day + " " +month + " " + year);
        if (this.an_exp > year)
            return false;
        else
        {
            if(this.an_exp == year)
            {
                if( this.luna_exp >month)
                    return false;
                else
                    if(this.luna_exp ==month)
                    {
                        if( this.zi_exp > day)
                            return false;
                    }
            }
        }
        return  true;
    }

    @Override
    public String toString() {
        return  "\n" + "Medicament: " + super.toString() + " " +
                ", data expirarii: " + zi_exp +
                "-" + luna_exp +
                "-" + an_exp +
                ", nr_pastile/cutie: " + nr_produse_cutie +
                ", doza_recomandata/zi: " + doza_recomandata_zi +
                ", concentratie: " + dozaj ;
    }
}
