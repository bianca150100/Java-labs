import java.util.Arrays;

public class Gestiune_medici {
    private Medic [] medici;
    protected int nr_medici;

    public Medic[] getMedici() {
        return medici;
    }

    public void setMedici(Medic[] medici) {
        this.medici = medici;
    }

    public int getNr_medici() {
        return nr_medici;
    }

    public void setNr_medici(int nr_medici) {
        this.nr_medici = nr_medici;
    }

    public Gestiune_medici() {
            this.medici = new Medic[3];
            this.medici[0]=new Medic("Ionescu","Radu", 2010, 4000, 200, "Radiologie", 5, 4 );
            this.medici[1]=new Medic("Avram","Radu", 2010, 4000, 200, "Radiologie", 5 , 4);
            this.medici[2]=new Medic("Cojocaru","Antonia", 2010, 4000, 200, "Radiologie", 5 , 4);
            this.nr_medici=3;

    }

    public void actualizeaza_medic(int index, Medic medic)
    {
        medici[index]=medic;
    }


    @Override
    public String toString() {
        return "Gestiune_medici{" +
                "medici=" + Arrays.toString(medici) +
                ", nr_medici=" + nr_medici +
                '}';
    }
}
