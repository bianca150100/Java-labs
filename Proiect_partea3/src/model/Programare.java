package model;

public class Programare implements Comparable<Programare> {
    protected int ziProg;
    protected int lunaProg;
    protected int anProg;
    protected int oraProg;
    private Pacient pacient;
    private Medic medic;
    public static int numarProg = 0;

    public Programare() {
        ziProg=0;
        lunaProg=0;
        anProg=0;
        oraProg=0;
        //numar_prog++;
    }

    @Override
    public int compareTo(Programare programare) {
        if (this.anProg - programare.getAnProg() !=0)
            return this.anProg - programare.getAnProg();
        if (this.lunaProg - programare.getLunaProg() != 0)
            return this.lunaProg - programare.getLunaProg();
        if (this.ziProg - programare.getZiProg() !=0)
            return this.ziProg - programare.getZiProg();

        return this.oraProg - programare.getOraProg();


    }

    public Programare(int zi_prog, int luna_prog, int an_prog, int ora_prog, Pacient pacient, Medic medic) {

        this.ziProg = zi_prog;
        this.lunaProg = luna_prog;
        this.anProg = an_prog;
        this.oraProg = ora_prog;
        this.pacient = pacient;
        this.medic = medic;
        numarProg++;
    }

    public int getZiProg() {
        return ziProg;
    }

    public void setZiProg(int ziProg) {
        this.ziProg = ziProg;
    }

    public int getLunaProg() {
        return lunaProg;
    }

    public void setLunaProg(int lunaProg) {
        this.lunaProg = lunaProg;
    }

    public int getAnProg() {
        return anProg;
    }

    public void setAnProg(int an_prog) {
        this.anProg = anProg;
    }

    public int getOraProg() {
        return oraProg;
    }

    public void setOraProg(int oraProg) {
        this.oraProg = oraProg;
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
                + pacient.get_nume() + " aveti o programare in data de: " + ziProg + "-" + lunaProg + "-" + anProg + " , ora: " + oraProg +
                ".Programare cu numarul:  " + numarProg;
    }

    public int getNumarProg() {
        return numarProg;
    }

    public void setNumarProg(int numarProg) {
        numarProg = numarProg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programare that = (Programare) o;
        return ziProg == that.ziProg &&
                lunaProg == that.lunaProg &&
                anProg == that.anProg &&
                oraProg == that.oraProg &&
                numarProg == that.numarProg ;
    }

    public String[] getStringfromArray() {
        return new String[] {Integer.toString(this.ziProg), Integer.toString(this.anProg),Integer.toString(this.lunaProg),
        Integer.toString(this.oraProg),this.pacient.get_nume(),this.pacient.get_prenume()};
    }

}
