import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Ustensile_Aparatura extends Dotare{
    private boolean unica_folosinta;
    private String utilizare;
    private String intrebuintare;
    private int timp_utilizare;
    private int an_achizitionare;

    public Ustensile_Aparatura() {
        super();
    }

    public Ustensile_Aparatura(String denumire, int nr_produse, String distribuitor, boolean unica_folosinta, String utilizare, String intrebuintare, int timp_utilizare, int an_achizitionare) {
        super(denumire, nr_produse, distribuitor);
        this.unica_folosinta = unica_folosinta;
        this.utilizare = utilizare;
        this.intrebuintare = intrebuintare;
        this.timp_utilizare = timp_utilizare;
        this.an_achizitionare = an_achizitionare;
    }

    public boolean isUnica_folosinta() {
        return unica_folosinta;
    }

    public void setUnica_folosinta(boolean unica_folosinta) {
        this.unica_folosinta = unica_folosinta;
    }

    public String getUtilizare() {
        return utilizare;
    }

    public void setUtilizare(String utilizare) {
        this.utilizare = utilizare;
    }

    public String getIntrebuintare() {
        return intrebuintare;
    }

    public void setIntrebuintare(String intrebuintare) {
        this.intrebuintare = intrebuintare;
    }

    public int getTimp_utilizare() {
        return timp_utilizare;
    }

    public void setTimp_utilizare(int timp_utilizare) {
        this.timp_utilizare = timp_utilizare;
    }

    public int getAn_achizitionare() {
        return an_achizitionare;
    }

    public void setAn_achizitionare(int an_achizitionare) {
        this.an_achizitionare = an_achizitionare;
    }

    @Override
    boolean verifica_valabilitate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();

        if (this.timp_utilizare + this.an_achizitionare > year)
        {
            return false;}
        return true;
    }

    @Override
    public String toString() {
        return "\nUstensile: " + super.toString() +
                ", utilizare: '" + utilizare +
                ", intrebuintare: '" + intrebuintare  +
                ", timp_maxim_de_utilizare: " + timp_utilizare +
                ", an_achizitionare: " + an_achizitionare ;
    }
}
