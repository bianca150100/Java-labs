import java.util.Comparator;
import java.util.Objects;

public class Programare implements Comparable<Programare> {
    protected int zi_prog;
    protected int luna_prog;
    protected int an_prog;
    protected int ora_prog;
    private Pacient pacient;
    private Medic medic;
    public static int numar_prog = 0;

    public Programare() {
        //numar_prog++;
    }

    @Override
    public int compareTo(Programare programare) {
       if (this.an_prog - programare.getAn_prog() !=0)
           return this.an_prog - programare.getAn_prog();
       if (this.luna_prog - programare.getLuna_prog() != 0)
           return this.luna_prog - programare.getLuna_prog();
       if (this.zi_prog - programare.getZi_prog() !=0)
           return this.zi_prog - programare.getZi_prog();

           return this.ora_prog - programare.getOra_prog();


    }

    public Programare(int zi_prog, int luna_prog, int an_prog, int ora_prog, Pacient pacient, Medic medic) {

        this.zi_prog = zi_prog;
        this.luna_prog = luna_prog;
        this.an_prog = an_prog;
        this.ora_prog = ora_prog;
        this.pacient = pacient;
        this.medic = medic;
        numar_prog++;
    }

    public int getZi_prog() {
        return zi_prog;
    }

    public void setZi_prog(int zi_prog) {
        this.zi_prog = zi_prog;
    }

    public int getLuna_prog() {
        return luna_prog;
    }

    public void setLuna_prog(int luna_prog) {
        this.luna_prog = luna_prog;
    }

    public int getAn_prog() {
        return an_prog;
    }

    public void setAn_prog(int an_prog) {
        this.an_prog = an_prog;
    }

    public int getOra_prog() {
        return ora_prog;
    }

    public void setOra_prog(int ora_prog) {
        this.ora_prog = ora_prog;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    @Override
    public String toString() {
        return "Programare: "
                + pacient + " aveti o programare in data de: " + zi_prog + "-" + luna_prog + "-" + an_prog + " , ora: " + ora_prog +
                ".Programare cu numarul:  " + numar_prog;
    }

    public int getNumar_prog() {
        return numar_prog;
    }

    public void setNumar_prog(int numar_prog) {
        numar_prog = numar_prog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programare that = (Programare) o;
        return zi_prog == that.zi_prog &&
                luna_prog == that.luna_prog &&
                an_prog == that.an_prog &&
                ora_prog == that.ora_prog &&
                numar_prog == that.numar_prog ;
    }

}
